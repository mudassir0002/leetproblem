class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        while(temp!=0){

            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }

            rev = rev*10+temp%10; 
            temp /=10;
        }
        return rev;
    }
}