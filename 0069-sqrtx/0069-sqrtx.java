class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
        int l=0;
        int h=x;
        while(l<=h){
            long mid = l + (h-l)/2;
            long val = mid*mid;
            if(val <=(long)x){
                l=(int)mid+1;
            }else{
                h = (int)mid-1;
            }
        }
        return h;
    }
}