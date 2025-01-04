class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int ind=0;
        for(int i=0 ;i<n ;i++){
            if(max<nums[i]){
                ind=i;
                max = nums[i];
            }
        }
        return ind;
    }
}