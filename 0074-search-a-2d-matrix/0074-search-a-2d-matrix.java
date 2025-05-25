class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        // for(int i=0; i<m ; i++){
        //     for(int j=0 ; j<n ; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int s=0;
        int e= m*n-1;
        while(s<=e){
            int mid = (s+e)/2;
            int row=mid/m , col = mid%m;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}