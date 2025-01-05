import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted character arrays
        return Arrays.equals(sArray, tArray);
    }
}
