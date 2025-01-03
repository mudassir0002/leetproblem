class Solution {
    public static int last(int nums[],int k){
        int n = nums.length;
        int s=0,e= n-1;
        int v=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid]==k){
                v=mid;
                s = mid+1;
            }else if(nums[mid]>k){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return v;
    }

    public static int first(int nums[],int k){
        int n = nums.length;
        int s=0,e= n-1;
        int v=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid]==k){
                v=mid;
                e = mid-1;
            }else if(nums[mid]>k){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return v;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int a[] = new int[2];
        a[0] = first(nums,target);
        a[1] = last(nums,target);
        return a;
    }
}