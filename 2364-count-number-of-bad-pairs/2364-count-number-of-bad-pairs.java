class Solution {
    public long countBadPairs(int[] nums) {
        int cnt=0;
        int n = nums.length;
        if(n==1 || n==0){
            return 0;
        }
        for(int i=0 ;i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(j-i != nums[j]-nums[i]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}