class Solution {
    public List<String> stringMatching(String[] words) {
         List<String> ans = new ArrayList<String>();
        for(int i=0 ;i<words.length ; i++){
            for(int j=0 ;j<words.length ;j++){
                if(words[i].contains(words[j]) && i!=j){
                    ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}