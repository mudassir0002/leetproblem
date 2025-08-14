class Solution {
    public String largestGoodInteger(String num) {
        String maxNum="";
        int n = num.length();
        for(int i=0 ;i<n-2 ; i++){
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i+1);
            char ch3 = num.charAt(i+2);
            if(ch1 == ch2 && ch2 == ch3){
                String current = "" + ch1 + ch2 + ch3;

            if(maxNum.equals("") || current.compareTo(maxNum) >0){
                maxNum = current;
            }
            }

        }
        return maxNum;
    }
}