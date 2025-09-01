class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character ,Character> map = new HashMap<>();
        for(int i =0 ; i<s.length() ; i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(!map.containsKey(sc)){
                if(!map.containsValue(tc)){
                    map.put(s.charAt(i) , t.charAt(i));
                }else{
                    return false;
                }
            }else if( map.get(sc) != tc){
                return false;
            }
        }
        return true;

        // int m1[] = new int[256];
        // int m2[] = new int[256];
        // if(s.length() != t.length()){
        //     return false;
        // }
        // for(int i=0 ; i< s.length() ; i++ ){
        //     if(m1[s.charAt(i)] != m2[t.charAt(i)]){
        //         return false;
        //     }
        //     m1[s.charAt(i)] = i+1;
        //     m2[t.charAt(i)] = i+1;
        // }
        // return true;
    }
}