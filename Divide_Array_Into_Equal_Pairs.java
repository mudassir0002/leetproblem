class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        for(int i=0 ; i<n ; i++){
            arr[nums[i]] = arr[nums[i]] + 1;
        }
        for(int i=0 ; i<n ;i++){
            if(arr[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}