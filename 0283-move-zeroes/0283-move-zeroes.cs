public class Solution {
    public void MoveZeroes(int[] nums) {
        int cnt=0;
        int []arr = new int[nums.Length];
        int j=0;
        for(int i=0 ; i<nums.Length ; i++){
            if(nums[i]==0){
                cnt++;
            }else{
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=j ; i<nums.Length ;i++){
           arr[i] = 0;
        }
        for(int i=0 ; i<nums.Length ;i++){
           nums[i] =arr[i] ;
        }
    }
}