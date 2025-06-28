class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Arrays.sort(nums);
        int a[] = new int[k];
        int count=0;
        for(int i=nums.length - k; i< nums.length   ; i++){
            a[count] = nums[i];
            count++;
        }
        return a;
    }
}