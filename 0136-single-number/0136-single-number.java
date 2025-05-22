class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0 ; i<nums.length-2 ;i=i+2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // if(nums.length==1){
        //     return nums[0];
        // }else{
        //     if(nums[nums.length-1]!=nums[nums.length-2]){
        //     return nums[nums.length-1];
        // }
        // }
        int n = nums.length;
        if(nums.length==1 || nums.length==0){
            return nums[0];
        }
        int count=0;
        for(int i=0 ; i<n ; i++){
            int x = nums[i];
            for(int j=0 ; j<n ;j++){
                if(nums[j]==x){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
            count=0;
        }
        return -1;

        
        // int arr[] = new int[n];
        // for(int i=0 ;i<n ; i++){
        //     arr[nums[i]]++;
        // }
        // for(int i=0 ;i<n ; i++){
        //     if(arr[i]==1){
        //         return i;
        //     }
        // }
        // return -1;


        // if(nums.length==1 || nums.length==0){
        //     return nums[0];
        // }
        // int ans= nums[0];
        // for(int i=1 ; i<nums.length ;i++){
        //     ans = ans ^ nums[i];
        // }
        // return ans;
    }
}