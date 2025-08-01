class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // int count=0;
        // int hash[] = new int[n+100];
        // for(int i=0 ;i<n ; i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0 ; i<=hash.length ;i++){
        //     if(hash[i]>(n/2)){
        //         return i;
        //     }
        // }
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
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0 ; i<nums.length ; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i] , map.get(nums[i]) + 1);
        //     }else{
        //         map.put(nums[i] , 1);
        //     }
        // }

        // for(Map.Entry<Integer,Integer> m : map.entrySet()){
        //     if(m.getValue()>(n/2)){
        //         return m.getKey();
        //     }
        // }

        // return -1;
        Arrays.sort(nums);
        int curr=1;
        int max =-1;
        int idx=-1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1; i<nums.length ; i++){
            if(nums[i]==nums[i-1]){
                curr++;
            }else{
                curr=1;
            }
            if(curr>max){
                idx=nums[i];
            }
            max = Math.max(curr , max);
        }
        return idx;
    }
}