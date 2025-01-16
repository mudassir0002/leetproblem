class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor!=0){
            if(dividend<0 && divisor<0){
                return -1*dividend -1;
            }
            return (dividend/divisor);
        }
        return 0;
    }
}