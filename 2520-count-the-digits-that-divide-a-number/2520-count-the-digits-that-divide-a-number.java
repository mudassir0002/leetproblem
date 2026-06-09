class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int temp = num;
        while(temp!=0){

            if(num % (temp%10) ==0){
                cnt++;
            }
            temp = temp/10;
        }
        return cnt;
    }
}