class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n-1 ; j++){
                if(nums[j]==nums[j+1]){
                    nums[j] = nums[j] *2;
                    nums[j+1]=0;
                }
            }
        }

        for(int i=0 ; i<n-1 ; i++){
            if(nums[i]==0){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
            }
        }
        
        return nums;
    }
}