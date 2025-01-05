class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        int n = num.length();
        int count=0;
        for(int i=n-1 ; i>=0 ; i--){
            if((num.charAt(i)-'0')%2!=0){
                break;
            }else{
                count++;
            }
        }
        for(int i=0 ; i < n-count ; i++){
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}