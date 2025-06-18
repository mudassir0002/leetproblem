class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        if(n==0){
            return true;
        }
        char ch[] = s.toCharArray();
        // if(n==1 && ch[0]=='*'){
        //     return true;
        // }else{
        //     return false;
        // }
        int st=0,e=0;
        for(int i=0 ; i<ch.length ; i++){
            if(ch[i]=='('){
                st++;
            }else if(ch[i]==')'){
                st--;
            }
        }
        if(st==0){
            return true;
        }else if(st<0){
            e=0;
            for(int i=0 ; i<ch.length ; i++){
                if(ch[i]=='*'){
                    e++;
                }else if(ch[i]==')' && e>0){
                    st++;
                    e--;
                }
            }
        }else{
            e=0;
            for(int i=ch.length-1 ; i>0 ; i--){
                if(ch[i]=='*'){
                    e++;
                }else if(ch[i]=='(' && e>0){
                    st--;
                    e--;
                }
            }
        }

        if(st==0){
            return true;
        }else{
            return false;
        }
        

    }
}