class Solution {
    public boolean lemonadeChange(int[] bills) {
        Arrays.sort(bills);
        int amount[] = new int[3];
        for(int i=0 ;i<bills.length ; i++){
            if(bills[i]==5){
                amount[0] +=5;
            }else if(bills[i]==10){
                if(amount[0]>=5){
                    amount[0] -=5;
                    amount[1] +=10;
                }else{
                    return false;
                }
            }else{
                if(amount[0]>=5 && amount[1]>=10){
                    amount[0] -=5;
                    amount[1] -=10;
                    amount[2] +=20;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}