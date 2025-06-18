class Solution {
    public int jump(int[] nums) {
        int steps = 0, farest = 0, end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farest = Math.max(farest, i + nums[i]);
            
            if (i == end) {
                steps++;
                end = farest;
            }
        }
        return steps;
    }
}