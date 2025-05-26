class Solution {
    // Helper method to reverse a string
    public String reverse(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            st.append(s.charAt(i));
        }
        return st.toString();
    }

    // Method to find the longest palindromic substring
    public String longestPalindrome(String s) {
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (sub.equals(reverse(sub))) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        return longest;
    }
}
