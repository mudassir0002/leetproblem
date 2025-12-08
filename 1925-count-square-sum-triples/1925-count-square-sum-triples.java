class Solution {
    //brute force
    public int countTriples(int n) {
        int cnt = 0;
        for(int k=n ; k>1 ; k--){
            for(int i=n-1 ; i>=1 ; i--){
                for(int j=n-1 ; j>=1 ; j--){
                    if( ((i*i) + (j*j)) == k*k){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}