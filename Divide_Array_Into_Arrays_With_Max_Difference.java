import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        if (n % 3 != 0) {
            return new int[0][];
        }

        Arrays.sort(nums);
        int[][] result = new int[n / 3][3];

        for (int i = 0; i < n; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][];
            }
            result[i / 3][0] = nums[i];
            result[i / 3][1] = nums[i + 1];
            result[i / 3][2] = nums[i + 2];
        }

        return result;
    }
}
