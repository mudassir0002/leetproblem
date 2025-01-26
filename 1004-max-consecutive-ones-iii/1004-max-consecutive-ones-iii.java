class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int len =0;
        int max = 0;
        for(int i=0; i<nums.length-1 ; i++){
            zero=0;
            for(int j=i ; j<nums.length ; j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    len = j-i +1;
                    max = Math.max(len,max);
                }else{
                    break;
                }
            }
        }
        return max;
    }
}