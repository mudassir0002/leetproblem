class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int []ans = new int[nums.size()];
        int n = nums.size();
        for(int i=0 ; i<n ; i++){
            ans[i] = -1;
        }
        for(int i=0 ;i<n ; i++){
            for(int j=1 ; j<nums.get(i) ; j++){
                if( (j | (j+1) ) == nums.get(i) ){
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
}