class Solution {
    public int removeDuplicates(int[] nums) {
        // int j=1;
        // for(int i=1 ; i<nums.length ; i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[j] = nums[i];
        //         j++;
        //     }
        // }
        // return j;
        // int n = nums.length;
        // int arr[] = new int[nums.length];
        // for(int i=0 ; i<n ; i++){
        //     arr[nums[i]]++;
        // }
        // int count=0;
        // for(int i=0 ; i<n ; i++){
        //     if(arr[i]>=1){
        //         nums[i]=i;
        //         count++;
        //     }
        // }
        // return count;
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}