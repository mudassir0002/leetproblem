class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> st = new ArrayList<>();
        int count =0;
        for(int i=0 ; i<words1.length ;i++){
            for(int j=0 ; j<words2.length ; j++){
                if(words1[i].contains(words2[j])){
                    count++;
                }
            }
            if(count == words2.length){
                st.add(words1[i]);
            }
            count=0;
        }
        return st;
    }
}