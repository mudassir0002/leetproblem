class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n-1 ; j++){
                if(nums[j]==nums[j+1]){
                    nums[j] = nums[j] *2;
                    nums[j+1]=0;
                }
            }
        }
        int count=0;
        int k=0;
        for(int i=0 ; i<n ; i++){
            if(nums[i]!=0){
                nums[k++] = nums[i];
            }else{
                count++;
            }
        }

        for(int i=k ; i<k+count ; i++){
            nums[i]=0;
        }
        
        return nums;
    }
}