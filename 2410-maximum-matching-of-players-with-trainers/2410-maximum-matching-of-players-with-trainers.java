class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int cnt=0;
        for(int i=0 ; i<players.length ;i++){
            int j=i;
            while(j<trainers.length){
                if(players[i]<=trainers[j]){
                    cnt++;
                    trainers[j]=-1;
                    break;
                }else{
                    j++;
                }
            }
        }
        return cnt;
    }
}