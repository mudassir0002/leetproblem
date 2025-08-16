class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int rev=0;
        int cnt=0;
        String str = Integer.toString(num);
        StringBuilder st = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++){
            if(cnt==0 && str.charAt(i)=='6'){
                st.append('9');
                cnt++;
            }else{
                st.append(str.charAt(i));
            }
        }
        String str2 = st.toString();
        return Integer.parseInt(str2);
        // while(n>0){
        //     rev = rev*10 + n%10;
        //     n = n/10;
        //     cnt++;
        // }
        // int ans=0;
        // for(int i=0 ;i<cnt ;i++){
        //     if(rev%10==6){
        //         ans =
        //     }else{

        //     }
            
        // }
    }
}