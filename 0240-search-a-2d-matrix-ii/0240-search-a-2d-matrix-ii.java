class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        // for(int i=0; i<n ; i++){
        //     for(int j=0 ; j<m ; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int row=0 ; 
        int col=m-1;
        while(col>=0 && row<n){
            if(matrix[row][col]==target)return true;
            else if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;
    }
}