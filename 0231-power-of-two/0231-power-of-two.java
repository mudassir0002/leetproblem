class Solution {
    public boolean isPowerOfTwo(int n) {
        if((n & (n-1))==0 && n>0){
            return true;
        }else{
            return false;
        }
    }
}