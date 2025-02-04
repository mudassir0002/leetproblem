class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max =0;
        int curr=nums[0];
        if(n==1){
            return nums[0];
        }
        for(int i=1 ; i<n ; i++){
            max = Math.max(max,curr);
            if(nums[i-1]<nums[i]){
                curr+=nums[i];
            }else{
                curr=nums[i];
            }
            max = Math.max(max,curr);
        }
        return max;
    }
}