class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ob =0;
        for(char c : s.toCharArray()){
            if(c=='('){
                if(ob>0){
                    sb.append(c);
                }
                ob++;
            }else{
                ob--;
                if(ob>0){
                    sb.append(c);
                }
            }
        } 
        return sb.toString();
    }
}