class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int totalSum=0;
        for(int i=0 ;i<k ; i++){
            lsum = lsum + cardPoints[i];
        }
        int j = cardPoints.length-1;
        for(int i=k-1 ;i>=0 ; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[j];
            j--;
            totalSum = Math.max(totalSum,lsum+ rsum);
        }
        return totalSum;
    }
}