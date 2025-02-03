class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int inc=1;
        int dec=1;
        int max=1;
        for(int i=1 ; i<n ; i++){
            if(nums[i-1]<nums[i]){
                inc++;
                dec=1;
            }else if(nums[i-1]>nums[i]){
                dec++;
                inc=1;
            }else{
                dec=1;
                inc=1;
            }
            max = Math.max(max,Math.max(dec,inc));
        }
        return max;
    }
}