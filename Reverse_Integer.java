class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        while(temp!=0){
            rev = rev*10+temp%10; 
            temp /=10;
        }
        return rev;
    }
}