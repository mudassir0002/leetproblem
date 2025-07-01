class Solution {
    public int possibleStringCount(String word) {
        int a[] = new int[26];
        for(int i=0 ; i<word.length()-1 ; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                a[word.charAt(i)-'a']++;
            }
        }
        int max=0;
        int ind=0;
        for(int i=0 ; i<26 ; i++){
            if(a[i]>max){
                max =a[i];
                ind = i;
            }
        }
        a[ind] = 0;
        int sum =0;
        for(int i=0 ; i<26 ; i++){
            sum +=a[i];
        }
        sum +=max;
        return sum+1;
    }
}