class Solution {

    public static int bsearch(int nums[],int s,int e,int target){
        
        // boolean flag = false;
        // while(s<=e){
        //     int mid = (s+e)/2;
        //     if(nums[mid]==target){
        //         flag=true;
        //         return mid;
        //     }else if(nums[mid]>target){
        //         e = mid-1;
        //     }else if(nums[mid]<target){
        //         s = mid+1;
        //     }
        // }
        // if(flag==false){
        //     return -1;
        // }
        // return -1;
        int mid = (s+e)/2;
            if(s>e){
                return -1;
            }
            if(nums[mid]==target){
                 return mid;
             }else if(nums[mid]>target){
                 return bsearch(nums,s,mid-1,target);
             }else if(nums[mid]<target){
                 return bsearch(nums,mid+1,e,target);
             }
             return -1;
    }

    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int result = bsearch(nums,s,e,target);
        return result;
    }
}