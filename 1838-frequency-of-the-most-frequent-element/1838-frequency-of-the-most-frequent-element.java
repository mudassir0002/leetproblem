class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int ans=0;
        long curr=0;
        for(int r=0 ;r<nums.length ; r++){
            long targer = nums[r];
            curr+=targer;
            while((r-l+1)*targer - curr > k){
                curr -=nums[l];
                l++;
            }
            ans = Math.max(ans , r - l +1);
        }
        return ans;
    }
}