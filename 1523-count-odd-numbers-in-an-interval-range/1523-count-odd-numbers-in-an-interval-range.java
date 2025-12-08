class Solution {
    public int countOdds(int low, int high) {
        int cnt=0;
        if(low % 2 !=0){
            cnt++;
        }
        if(high % 2 !=0){
            cnt++;
        }
        if(cnt == 2){
            cnt += ((high-1) - (low+1))/2;
        }
        if(cnt == 1){
            if(high % 2 !=0 ){
                cnt += ((high-1) - low)/2 ;
            }else{
                cnt += (high - (low+1))/2 ;
            }
        }
        if(cnt == 0){
            cnt += (high - low)/2;
        }
        // while(low <= high){
        //     if(low % 2 !=0){
        //         cnt++;
        //     }
        //     low++;
        // }
        return cnt;
    }
}