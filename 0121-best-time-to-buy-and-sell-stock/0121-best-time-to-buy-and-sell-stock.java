class Solution {
    public int maxProfit(int[] nums) {
        // int profit=0;
        // int n=nums.length;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<n ;i++){
        //     min = Math.min(min , nums[i]);
        //     max = Math.max(max , nums[i] - min);
        // }
        // return max;

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for(int i=0 ; i<nums.length ; i++){
        //     min = Math.min(min , nums[i]);
        //     max = Math.max(max , nums[i]-min );
        // }
        // return max;

        int buy=nums[0];
        int profit=0;

        for(int i=1 ; i<nums.length ; i++){
            if(buy>nums[i]){
                buy=nums[i];
            }
            if(nums[i]>buy){
                profit= Math.max(profit,nums[i]-buy);
            }
        }
        return profit;
    }
}