class Solution {
    static boolean vowel(char ch){
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
            return true;
        }else{
            return false;
        }
        
    }
    public String reverseVowels(String s) {

        char arr[] = s.toCharArray();
        char vow[] = new char[s.length()];
        int cnt=0;
        for(int i=s.length()-1 ;i>=0 ; i--){
            if(vowel(arr[i])){
                vow[cnt]=arr[i];
                cnt++;
            }
        }
        cnt=0;
        for(int i=0 ;i<=s.length()-1 ; i++){
            if(vowel(arr[i])){
                arr[i]=vow[cnt];
                cnt++;
            }
        }
        return new String(arr);
    }
}