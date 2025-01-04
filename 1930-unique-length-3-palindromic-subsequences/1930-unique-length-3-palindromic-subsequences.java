class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        // Arrays to store first and last occurrence of each character
        int[] first = new int[26];
        int[] last = new int[26];
        // Initialize arrays
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
            last[i] = -1;
        }

        // Populate first and last occurrence of each character
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (first[index] == -1) {
                first[index] = i;
            }
            last[index] = i;
        }

        Set<String> palindromicSubsequences = new HashSet<>();

        // Iterate over all possible characters for the center
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] - first[i] > 1) {
                Set<Character> middleChars = new HashSet<>();
                // Collect all unique characters between the first and last occurrence
                for (int j = first[i] + 1; j < last[i]; j++) {
                    middleChars.add(s.charAt(j));
                }
                // Form palindromic subsequences with the unique middle characters
                for (char middle : middleChars) {
                    palindromicSubsequences.add("" + (char) (i + 'a') + middle + (char) (i + 'a'));
                }
            }
        }
        return palindromicSubsequences.size();
    }
}
