class Solution {
    public boolean findSubarrays(int[] arr) {
        int n = arr.length;
        int count=0;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n-1 ; j++){
                if(arr[i]+arr[i+1] == arr[j] + arr[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
}