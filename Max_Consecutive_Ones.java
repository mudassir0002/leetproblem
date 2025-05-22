class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int curr=0;
        // for(int i=0 ;i<nums.length ; i++){
        //     if(nums[i]==1){
        //         curr++;
        //     }else{
        //         if(curr>max){
        //             max = curr;
        //         }
        //         curr=0;
        //     }
        //     if(curr>max){
        //             max = curr;
        //     }
        // }

        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]==1){
                curr++;
            }else{
                max = Math.max(max,curr);
                curr=0;
            }
        }
        max = Math.max(max,curr);

        return max;
    }
}