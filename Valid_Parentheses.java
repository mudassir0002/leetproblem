class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();
        for(int i=0 ;i<s.length() ; i++){
            
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if (st.isEmpty()) return false;
                if((s.charAt(i)==')' && st.peek().equals('(')) ||
                    (s.charAt(i)==']' && st.peek().equals('[')) || 
                    (s.charAt(i)=='}' && st.peek().equals('{')))
                    {
                    st.pop();
                    }else{
                        return false;
                    }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}