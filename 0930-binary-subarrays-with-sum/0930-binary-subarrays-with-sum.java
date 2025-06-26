class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int cnt=0;
        int max=0;
        int n = nums.length;
        for(int i=0 ;i<n ; i++){
            for(int j=i ; j<n ;j++){
                sum = sum + nums[j];
                if(sum==goal){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}