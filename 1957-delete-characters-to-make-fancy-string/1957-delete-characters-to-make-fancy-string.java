class Solution {
    public String makeFancyString(String s) {
        int cnt=1;
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(prev);
        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i) == prev){
                cnt++;
            }else{
                prev = s.charAt(i);
                cnt=1;
            }

            if(cnt<3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}