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
        // int m1[] = new int[26];
        
        // for(int i=0 ;i<s.length() ; ++i){
        //     m1[s.charAt(i) -'a']++;
        // }
        // for(int i=0 ;i<t.length() ; ++i){
        //     m1[t.charAt(i)-'a']--;
        // }
        // for(int i=0 ; i<m1.length ; i++){
        //     if(m1[i]!=0){
        //         return false;
        //     }
        // }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) +1);
        }

        for(int i=0 ; i<t.length() ; i++){
            if(map.get(t.charAt(i)) != null){
                if(map.get(t.charAt(i))==1){
                    map.remove(t.charAt(i));
                }else{
                    map.put(t.charAt(i) , map.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }

        return true;
    }
}
