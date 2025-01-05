import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // // If the lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // // Convert strings to character arrays
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();

        // // Sort the character arrays
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);

        // // Compare the sorted character arrays
        // return Arrays.equals(sArray, tArray);
        char m1[] = new char[27];
        
        for(int i=0 ;i<s.length() ; i++){
            m1[s.charAt(i)-'a']++;
            m1[t.charAt(i)-'a']--;
        }
        for(int i=0 ; i<s.length() ; i++){
            if(m1[i]!=0){
                return false;
            }
        }
        return true;
    }
}
