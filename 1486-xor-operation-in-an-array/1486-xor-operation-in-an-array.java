class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;
        int i=1;
        while(i<n){
            ans = ans ^ (start + 2*i);
            i++;
        }
        return ans;
    }
}