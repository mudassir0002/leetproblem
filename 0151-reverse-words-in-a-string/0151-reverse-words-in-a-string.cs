public class Solution {
    public string ReverseWords(string s) {
        string[] str = s.Split(' ', StringSplitOptions.RemoveEmptyEntries);

        StringBuilder sb = new StringBuilder();

        // Traverse words from the end to the start
        for (int i = str.Length - 1; i >= 0; i--) {
            sb.Append(str[i]);
            if (i > 0) sb.Append(' '); // avoid extra space at the end
        }

        return sb.ToString();
    }
}