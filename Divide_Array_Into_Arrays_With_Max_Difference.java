class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int a[][] = new int[n/3][3];
        if(n%3!=0){
            return a;
        }
        Arrays.sort(nums);
        int i=0;
        int count=0;
        while(i<n){
            if( (Math.abs(nums[i]-nums[i+1]) <= k) &&
                (Math.abs(nums[i+1]-nums[i+2]) <= k) &&
                (Math.abs(nums[i]-nums[i+2]) <= k) 
              ){
                a[count][0] = nums[i];
                a[count][1] = nums[i+1];
                a[count][2] = nums[i+2];
            }else{
                return new int[0][];
            }
            i=i+3;
            count++;
        }
        return a;
    }
}