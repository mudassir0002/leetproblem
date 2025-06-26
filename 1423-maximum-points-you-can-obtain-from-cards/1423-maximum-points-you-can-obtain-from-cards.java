class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int leftSum = 0;
     int rightSum = 0;
     int totalSum = 0;

    for(int i=0;i<k;i++) {
        leftSum += cardPoints[i];
    }
    totalSum = leftSum;
    
    int j = cardPoints.length-1; // rightindex
    for(int i=k-1;i>=0;i--) {
        leftSum -= cardPoints[i];
        rightSum += cardPoints[j];
        j--;

        totalSum = Math.max(totalSum,leftSum+ rightSum);
    }

    return totalSum;
    }
}