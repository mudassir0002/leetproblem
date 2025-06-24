class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int curr=0;
        if(k>cardPoints.length){
            for(int i=0 ;i<cardPoints.length ; i++){
                curr = curr + cardPoints[i];
            }
        }else{
            for(int i=0 ;i<k ; i++){
                curr = curr + cardPoints[i];
            }
            max = Math.max(max , curr);
            curr=0;
            for(int i=cardPoints.length - 1  ; i>= cardPoints.length - k ; i--){
                curr = curr + cardPoints[i];
            } 
        }

        max = Math.max(max , curr);
        return max;
    }
}