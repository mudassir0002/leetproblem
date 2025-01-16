class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int a[] = new int[n1*n2];
        int cnt =0;
        for(int i=0 ;i<n1 ; i++){
            for(int j=0 ; j<n2 ; j++){
                a[cnt] = nums1[i]^nums2[j];
                cnt++;
            }
        }
        int ans = a[0];
        for(int i=1 ; i<cnt ; i++){
            ans = ans^a[i];
        }
        return ans;
    }
}