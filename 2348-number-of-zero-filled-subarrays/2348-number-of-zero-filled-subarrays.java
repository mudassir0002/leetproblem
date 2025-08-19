class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        long count = 0;  // consecutive zeros count

        for (int num : nums) {
            if (num == 0) {
                count++;            // extend zero subarray
                result += count;    // add all subarrays ending here
            } else {
                count = 0;          // reset if non-zero
            }
        }
        return result;
    }
}