class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0 ; i<k ; i++){
            int min = nums[0];
            int r = 0;
            for(int j=1 ; j<=nums.length-1 ; j++){
                if( min > nums[j]){
                    min = nums[j];
                    r=j;
                }
            }
            nums[r] = multiplier*nums[r];
        }

        return nums;
    }
}