class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        // int zero=0;
        // int one=0;
        // int two=0;
        // int n = nums.length;
        // for(int i=0 ; i<n ; i++){
        //     if(nums[i]==0){
        //         zero++;
        //     }else if(nums[i]==1){
        //         one++;
        //     }else{
        //         two++;
        //     }
        // }
        // for(int i=0 ;i<zero ;i++){
        //     nums[i]=0;
        // }
        // for(int i=zero ;i<zero + one ;i++){
        //     nums[i]=1;
        // }
        // for(int i=zero + one ;i<zero + one + two ;i++){
        //     nums[i]=2;
        // }
        int n = nums.length;
        // int arr[] = new int[3];
        // for(int i=0 ; i<n ; i++){
        //     arr[nums[i]]++;
        // }
        // for(int i=0 ; i<arr[0] ; i++){
        //     nums[i] = 0;
        // }
        // for(int i=arr[0] ; i<arr[0]+arr[1] ; i++){
        //     nums[i]=1;
        // }
        // for(int i=arr[1] + arr[0] ; i<arr[0]+arr[1]+arr[2] ; i++){
        //     nums[i] = 2;
        // }
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }

    }
}