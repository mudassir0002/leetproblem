class Solution {
    public int myAtoi(String s) {
        int ans=0;
        boolean flag=false;
        boolean sign=false;
        char []ch = s.toCharArray();
        for(int i=0 ; i<ch.length ;i++){
            if(ch[i]==' '){
                continue;
            }
            if(ch[i]=='-' && flag==false){
                sign=true;
            }
            if(ch[i]=='-' && flag==true){
                break;
            }
            
            if((ch[i]>='0' && ch[i]<='9')){
                ans = ans*10 + (ch[i] - '0');
                flag=true;
            }else if(flag==true && ans>0){
                break;
            }
            if(ch[i]>='a' && flag==false){
                break;
            }
        }
        if(sign==true){
            ans = -1 * ans;
        }
        return ans;
    }
}