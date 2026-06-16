class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []hash = new int[101];
        int max=0;
        for(int i=0 ; i<nums.length ; i++){
            hash[nums[i]]++;
            
        }
        int cnt=0;
        for(int i=0 ; i<hash.length ; i++){
            if(max<hash[i]){
                max = hash[i];
            }
        }

        for(int i=0 ; i<hash.length ; i++){
            if(max==hash[i]){
                cnt++;
            }
        }

        return cnt*max;
    }
}