class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
        }
        int max = nums.length / 3;
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() > max){
                ans.add(m.getKey());
            }
        }
        return ans;
    }
}