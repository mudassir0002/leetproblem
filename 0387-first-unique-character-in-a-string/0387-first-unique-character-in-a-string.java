class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        char ch[] = s.toCharArray();
        for(int i=0 ;i<s.length() ; i++){
            freq[ch[i]-'a']++;
        }
        for(int i=0  ;i<s.length() ; i++){
            if(freq[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}