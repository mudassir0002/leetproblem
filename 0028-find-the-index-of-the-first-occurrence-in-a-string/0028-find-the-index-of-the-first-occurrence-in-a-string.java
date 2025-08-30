class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=needle.length();
        while(j<haystack.length()){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
            j++;
            i++;
        }
        return -1;
    }
}