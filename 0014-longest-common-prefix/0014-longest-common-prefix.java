class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        int fl = first.length();
        int ll = last.length();
        int max = Math.min(fl,ll);
        for(int i=0 ; i<max ;i++){
            if(first.charAt(i)==last.charAt(i)){
                sb.append(first.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}