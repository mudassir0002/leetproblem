class Solution {
    public int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE;
        // int currSum = 0;
        // int n = nums.length;


        // for(int i=0 ;i<n ;i++){
        //         currSum +=nums[i];
        //         if(maxSum < currSum){
        //             maxSum = currSum;
        //         }
        //         if(currSum<0){
        //             currSum=0;
        //         }
        // }
        // return maxSum;
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
            for(int j=0 ; j<n ; j++){
                sum = sum + nums[j];
                maxSum = Math.max(sum , maxSum);
                if(sum<0){
                    sum=0;
                }
            }
        return maxSum;
    }
}