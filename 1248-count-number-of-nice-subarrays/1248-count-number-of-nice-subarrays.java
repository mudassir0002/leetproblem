class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int a[] = new int[nums.length];
        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]%2==0){
                a[i]=0;
            }else{
                a[i]=1;
            }
        }
        int i = 0, j = 0, n = a.length, sum = 0, cnt1 = 0, cnt2 = 0;
        while(j < n){
             sum += a[j];
             while(i <= j && sum > k) sum -= a[i++];
             cnt1 += j-i+1;
             j++;
         }
         i = 0; j = 0; sum = 0;
         while(j < n){
             sum += a[j];
             while(i <= j && sum >= k) sum -= a[i++];
             cnt2 += j-i+1;
             j++;
         }
         return cnt1-cnt2;
    }
}