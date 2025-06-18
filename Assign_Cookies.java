class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        int n = Math.min(g.length , s.length);
        for(int i=0 ; i< n ; i++){
            if(s[i]>=g[i]){
                cnt++;
            }
        }
        return cnt;
    }
}