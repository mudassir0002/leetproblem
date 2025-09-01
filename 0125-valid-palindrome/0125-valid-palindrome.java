class Solution {
    static boolean palindrome(String s ){

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare the original string with 
        // the reversed string
        return s.equals(rev);
    }
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll(",", "").replaceAll(":", "").replaceAll(" ", "");
        return palindrome(str);
    }
}