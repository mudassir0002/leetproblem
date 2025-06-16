class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch== '(' || ch== '[' || ch == '{'){
                s1.push(ch);
            }else{
                if (s1.isEmpty()) return false;
                char top = s1.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}