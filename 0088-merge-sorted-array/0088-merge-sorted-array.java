class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // int[] arr = new int[m + n]; // Corrected size
        // int l1 = 0, l2 = 0;
        // int i = 0;

        // // Compare elements from nums1 (up to m) and nums2 (up to n)
        // while (l1 < m && l2 < n) {
        //     if (nums1[l1] < nums2[l2]) {
        //         arr[i++] = nums1[l1++];
        //     } else {
        //         arr[i++] = nums2[l2++];
        //     }
        // }

        // // Copy remaining elements from nums1 (if any)
        // while (l1 < m) {
        //     arr[i++] = nums1[l1++];
        // }

        // // Copy remaining elements from nums2 (if any)
        // while (l2 < n) {
        //     arr[i++] = nums2[l2++];
        // }

        // // Copy merged result back to nums1
        // for (i = 0; i < m + n; i++) {
        //     nums1[i] = arr[i];
        // }


        // int p1 = m - 1; // Pointer for the last element in nums1 (excluding extra space)
        // int p2 = n - 1; // Pointer for the last element in nums2
        // int p = m + n - 1; // Pointer for the last position in nums1

        // // Merge nums2 into nums1 in reverse order
        // while (p1 >= 0 && p2 >= 0) {
        //     if (nums1[p1] > nums2[p2]) {
        //         nums1[p] = nums1[p1];
        //         p1--;
        //     } else {
        //         nums1[p] = nums2[p2];
        //         p2--;
        //     }
        //     p--;
        // }

        // // If there are remaining elements in nums2, copy them
        // while (p2 >= 0) {
        //     nums1[p] = nums2[p2];
        //     p2--;
        //     p--;
        // }

        // int arr[] = new int[m+n];
        // int l=0;
        // int r=0;
        // int k=0;
        // while(l<m && r<n){
        //     if(nums1[l] < nums2[r] ){
        //         arr[k++]=nums1[l++];
        //     }else{
        //         arr[k++]=nums2[r++];
        //     }
        // }

        // while(l<m){
        //     arr[k++]=nums1[l++];
        // }

        // while(r<n){
        //     arr[k++]=nums2[r++];
        // }

        // for(int i=0 ;i<n+m ; i++){
        //     nums1[i]=arr[i];
        // }
        int l=0;
        int r=0;
        int k=0;
        int arr[] = new int[m+n];
        while(l < m && r < n){
            if(nums1[l]<nums2[r]){
                arr[k++] = nums1[l++];
            }else{
                arr[k++] = nums2[r++];
            }
        }
        while(l < m){
            arr[k++] = nums1[l++];
        }

        while(r < n){
            arr[k++] = nums2[r++];
        }
        for(int i=0 ;i<n+m ; i++){
            nums1[i]=arr[i];
        }

    }
}
