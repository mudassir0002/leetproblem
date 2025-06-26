class Solution {
    public int characterReplacement(String s, int k) {
        int []freq = new int[128];
        int maxFreq =0 , maxLen = 0, l=0;
        for(int r=0 ; r < s.length() ; r++){
            freq[s.charAt(r)]++;
            maxFreq = Math.max(maxFreq , freq[s.charAt(r)]);
            if((r-l+1) - maxFreq >k){
                freq[s.charAt(l)]--;
                l++;
            }
            maxLen = Math.max(maxLen , r-l+1);
        }
        return maxLen;
    }
}