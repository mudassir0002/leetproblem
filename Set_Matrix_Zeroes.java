class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowcount[] = new int[row];
        int colcount[] = new int[col];
        for(int i=0 ;i<row ; i++){
            for(int j=0 ; j<col ; j++){
                if(matrix[i][j]==0){
                    rowcount[i]=1;
                    colcount[j]=1;
                }
            }
        }
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                if(rowcount[i]==1 || colcount[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}