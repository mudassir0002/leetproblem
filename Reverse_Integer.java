class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        if(x<0){
            temp = -temp;
            while(temp>0){
            rev = rev*10+temp%10; 
            temp /=10;
            }
            rev = -rev;
        }else{
            while(temp>0){
            rev = rev*10+temp%10; 
            temp /=10;
        }
        }
        
        return rev;
    }
}