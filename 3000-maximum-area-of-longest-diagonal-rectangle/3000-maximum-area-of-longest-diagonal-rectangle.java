class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        int maxDiagonal = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int a = dimensions[i][0];
            int b = dimensions[i][1];
            int currArea = a * b;
            int currDiagonal = a * a + b * b; // no need sqrt, compare squares

            if (currDiagonal > maxDiagonal || 
               (currDiagonal == maxDiagonal && currArea > maxArea)) {
                maxArea = currArea;
                maxDiagonal = currDiagonal;
            }
        }
        return maxArea;
    }
}