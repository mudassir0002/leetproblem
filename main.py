import os
import json
import requests
import subprocess
from datetime import datetime


REPO_PATH = "C:\\Users\\mudas\\Desktop\\project_\\leetproblem"
SESSION_COOKIE = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJfYXV0aF91c2VyX2lkIjoiMTE0MDczNjkiLCJfYXV0aF91c2VyX2JhY2tlbmQiOiJhbGxhdXRoLmFjY291bnQuYXV0aF9iYWNrZW5kcy5BdXRoZW50aWNhdGlvbkJhY2tlbmQiLCJfYXV0aF91c2VyX2hhc2giOiIzYWYwOWZkZGE4MDhiMmE3MDRkNjE2NDFlNzAyYTU3M2NjMWY0Y2Q5MmExNjAwMWQwOWY1M2QzNGNjOTMyOWFlIiwic2Vzc2lvbl91dWlkIjoiNTFhMTI5NWEiLCJpZCI6MTE0MDczNjksImVtYWlsIjoibXVkYXNzaXJzaWRkaXF1aTAzQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoibXVkYXNzaXJzaWRkaXF1aTAzIiwidXNlcl9zbHVnIjoibXVkYXNzaXJzaWRkaXF1aTAzIiwiYXZhdGFyIjoiaHR0cHM6Ly9hc3NldHMubGVldGNvZGUuY29tL3VzZXJzL2F2YXRhcnMvYXZhdGFyXzE2OTk2ODcxMDQucG5nIiwicmVmcmVzaGVkX2F0IjoxNzQ3NTY3MjMxLCJpcCI6IjE4My44Ny4xNzQuMTMwIiwiaWRlbnRpdHkiOiIwZTAzNjllMjgxM2RiN2RlYjI2ZTU5MzdjMzUzYWFiNCIsImRldmljZV93aXRoX2lwIjpbIjgyOTMxYjlhYmM3ZDliZDFhYzI2ZjQyZDYxOThkYzljIiwiMTgzLjg3LjE3NC4xMzAiXX0.R6TgtzU34opurQffZfaJ_-Vps807bkB-aUJoaAcsx1o"
CSRF_TOKEN = "WPYNkQ5D2TlGwrVsZeSeKqwNqxwqsvtCIWw2aUqsCbaseuEbZ9QhCHqCXrvQTnCN"
HEADERS = {
    "Cookie": f"LEETCODE_SESSION={SESSION_COOKIE}; csrftoken={CSRF_TOKEN}",
    "x-csrftoken": CSRF_TOKEN,
    "User-Agent": "Mozilla/5.0"
}

def fetch_leetcode_submissions():
    submissions = []
    offset = 100
    limit = 100

    while True:
        url = f"https://leetcode.com/api/submissions/?offset={offset}&limit={limit}"
        response = requests.get(url, headers=HEADERS)
        
        if response.status_code != 200:
            print("Failed to fetch submissions. Check your cookies.")
            break

        data = response.json()
        fetched_submissions = data.get("submissions_dump", [])
        
        if not fetched_submissions:
            break  # No more submissions to fetch
        
        submissions.extend(fetched_submissions)
        offset += limit  # Move to the next page

    return submissions

def commit_submission(title, code, lang, timestamp):
    file_extension = {
        "python3": "py",
        "java": "java",
        "cpp": "cpp",
        "c": "c",
        "javascript": "js"
    }.get(lang, "txt")

    filename = f"{title.replace(' ', '_')}.{file_extension}"
    filepath = os.path.join(REPO_PATH, filename)

    with open(filepath, "w") as f:
        f.write(code)

    commit_time = datetime.utcfromtimestamp(timestamp).strftime('%Y-%m-%dT%H:%M:%S')

    subprocess.run(["git", "add", filename], cwd=REPO_PATH)
    subprocess.run(["git", "commit", "-m", f"Add {title}", "--date", commit_time], cwd=REPO_PATH)

def main():
    os.chdir(REPO_PATH)

    submissions = fetch_leetcode_submissions()
    if not submissions:
        print("No submissions found.")
        return

    for sub in submissions:
        commit_submission(
            title=sub["title"],
            code=sub["code"],
            lang=sub["lang"],
            timestamp=sub["timestamp"]
        )

    subprocess.run(["git", "push"], cwd=REPO_PATH)

if __name__ == "__main__":
    main()