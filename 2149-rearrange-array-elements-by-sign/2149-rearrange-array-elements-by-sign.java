class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

        // Alternate between positive and negative numbers
        // int i = 0, p = 0, q = 0;
        // while (p < pos.size() && q < neg.size()) {
        //     nums[i++] = pos.get(p++);
        //     nums[i++] = neg.get(q++);
        // }
        boolean postive=true;
        int p=0;
        int ne=0;
        int i=0;
        while(i<n){
            if(postive==true){
                nums[i++]=pos.get(p++);
                postive=false;
            }else{
                nums[i++]=neg.get(ne++);
                postive=true;
            }
        }

        return nums;
    }
}
