class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length ;
        int s=0,e=n-1;
        int ans=-1;
        if(arr[e]<target){
            return e+1;
        }else if(arr[s]>target){
            return s-1;
        }
        while(s<=e){
            
            
            int mid=(s+e)/2;
            if(arr[mid]>=target){
                ans = mid;
                e=mid-1;
            }else if(target>arr[mid]){
                s=mid+1;
                
            }
        }
        return ans;
    }
}