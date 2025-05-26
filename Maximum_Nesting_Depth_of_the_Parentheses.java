class Solution {
    public int maxDepth(String s) {
        // int count = 0;
        // int max=0;
        // for(int i=0 ; i<s.length() ; i++){
        //     if(s.charAt(i)=='('){
        //         count++;
        //         max = Math.max(max,count);
        //     }else if(s.charAt(i)==')'){
        //         count--;
        //     }
        // }
        // return max;

        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                cnt++;
                max = Math.max(max , cnt);
            }else if(s.charAt(i) == ')'){
                cnt--;
            }
        }
        return max;
    }
}