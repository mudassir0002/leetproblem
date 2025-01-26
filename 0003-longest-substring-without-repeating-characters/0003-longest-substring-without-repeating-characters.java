class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0; // Initialize max to store the length of the longest substring
        for (int i = 0; i < s.length(); i++) {
            int cnt = 0; // Counter for the current substring length
            boolean[] visited = new boolean[256]; // Track visited characters (ASCII size)

            for (int j = i; j < s.length(); j++) {
                if (visited[s.charAt(j)]) {
                    break; // Stop if a duplicate character is found
                } else {
                    visited[s.charAt(j)] = true; // Mark the character as visited
                    cnt++; // Increment the count of the current substring
                    max = Math.max(max, cnt); // Update max if necessary
                }
            }
        }
        return max;
    }
}
