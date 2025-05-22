class Solution {
    public boolean check(int[] nums) {
        // int s=0;
        // int count=0;
        // for(int i=0 ; i<nums.length ;i++){
        //     if(nums[i]>nums[(i+1)%nums.length]){
        //         s=nums[i];
        //         count++;
        //     }
        // }

        // int max = Integer.MIN_VALUE;
        // for(int i=0 ; i<nums.length ;i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }
        // }
        // if(count>=2){
        //     return false;
        // }

        // if(max==s || s==0){
        //     return true;
        // }else{
        //     return false;
        // }
        int count =0;
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            if(nums[(i%n)]>nums[(i+1)%n]){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
            return true;
    }
}