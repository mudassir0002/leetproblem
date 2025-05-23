class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int odd=1,even=0;
        for(int i=0 ;i<n ; i++){
            if(nums[i]%2==0){
                arr[even]=nums[i];
                even +=2;
            }else{
                arr[odd]=nums[i];
                odd +=2;
            }
        }
        return arr;
    }
}