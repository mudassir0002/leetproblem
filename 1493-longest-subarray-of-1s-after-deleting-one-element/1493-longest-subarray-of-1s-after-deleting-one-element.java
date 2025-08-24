class Solution {
    public int longestSubarray(int[] nums) {
        int curr = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            curr = 0;
            boolean check = false;

            for (int j = i; j < nums.length; j++) { // \U0001f539 start from i, not 0
                if (nums[j] == 1) {
                    curr++;
                } else {
                    if (!check) {
                        check = true; // first zero allowed
                    } else {
                        break; // more than 1 zero → stop
                    }
                }
                max = Math.max(max, curr);
            }
        }
        return (max == nums.length) ? max - 1 : max; // \U0001f539 handle all-ones case
    }
}
