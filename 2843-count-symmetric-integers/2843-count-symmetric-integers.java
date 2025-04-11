class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt =0;
        
        for(int j=low ; j<=high ; j++){
            String s = Integer.toString(j);
            if(s.length() % 2 ==0){
                int sum1=0;
                int sum2=0;
                for(int i=0 ; i<s.length()/2 ; i++){
                    sum1 += s.charAt(i) - '0';
                }
                for(int i=s.length()/2 ; i<s.length() ; i++){
                    sum2 += s.charAt(i) - '0';
                }
                if(sum1==sum2){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}