class Solution {
    // Helper method to reverse a string
    // public String reverse(String s) {
    //     StringBuilder st = new StringBuilder();
    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         st.append(s.charAt(i));
    //     }
    //     return st.toString();
    // }

    // Method to find the longest palindromic substring
    public String longestPalindrome(String s) {
        // String longest = "";
        
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i; j < s.length(); j++) {
        //         String sub = s.substring(i, j + 1);
        //         if (sub.equals(reverse(sub))) {
        //             if (sub.length() > longest.length()) {
        //                 longest = sub;
        //             }
        //         }
        //     }
        // }

        // return longest;
         if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);       // Odd length palindrome
            int len2 = expandFromCenter(s, i, i + 1);   // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Helper function to expand from the center
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Length of the palindrome
        
    }
}
