class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = (n*(n+1))/2;
        // int sum2=0;
        // for(int i=0 ;i<n ; i++){
        //     sum2 += nums[i];
        // }
        // return sum - sum2;
        int n = nums.length;
        int arr[] = new int[n+1];
        
        for(int i=0 ;i<n ; i++){
            arr[nums[i]]++;
        }
        for(int i=0 ;i<=n ; i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }
}