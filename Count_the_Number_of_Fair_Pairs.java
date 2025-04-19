class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        for(int i = 0; i < nums.length; i++)
            for(int j = i+1; j < nums.length; j++)
                if(nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper)
                    ++ans;
        return ans;
    }
}