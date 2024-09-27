class Solution {
public:
    bool check(vector<int>& nums) {
        int small=0;
        for(int i=1 ; i<nums.size() ;i++){
            if(nums[small]>=nums[i]){
                small=i;
            }
        }
        for(int i = 0 ;i<nums.size()-1;i++){
            int index = (small + i)%nums.size();
            if(nums[index]>nums[(index+1)%nums.size()]){
                return false;
            } 
            
        }
        return true;  
    }
};