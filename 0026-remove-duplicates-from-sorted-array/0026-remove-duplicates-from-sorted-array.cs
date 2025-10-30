public class Solution {
    public int RemoveDuplicates(int[] nums) {
        HashSet<int> s = new HashSet<int>();
        foreach(int i in nums){
            if(!s.Contains(i)){
                s.Add(i);
            }
        }
        int index = 0;
        foreach (int val in s) {
            nums[index++] = val;
        }
        return s.Count;
    }
}