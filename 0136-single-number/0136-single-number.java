class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0 ; i<nums.length-2 ;i=i+2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // if(nums.length==1){
        //     return nums[0];
        // }else{
        //     if(nums[nums.length-1]!=nums[nums.length-2]){
        //     return nums[nums.length-1];
        // }
        // }

        if(nums.length==1 || nums.length==0){
            return nums[0];
        }
        int ans= nums[0];
        for(int i=1 ; i<nums.length ;i++){
            ans = ans ^ nums[i];

        }
        return ans;
    }
}