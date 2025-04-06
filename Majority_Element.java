class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count=0;
        int hash[] = new int[n+100];
        for(int i=0 ;i<n ; i++){
            hash[nums[i]]++;
        }
        for(int i=0 ; i<=hash.length ;i++){
            if(hash[i]>(n/2)){
                return i;
            }
        }
        // for(int i=0 ;i<n ;i++){
        //     count=0;
        //     for(int j=0 ;j<n ; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>(n/2)){
        //         return nums[i];
        //     }
        // }
        return -1;
    }
}