class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int curr=-1;
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]<nums[j]){
                curr = Math.abs(nums[i]-nums[j]);
                max = Math.max(max , curr);
                }else{
                    i++;
                }
            }
        }
        return max;
    }
}