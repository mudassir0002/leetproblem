public class Solution {
    public bool IsIsomorphic(string s, string t) {
        int n1 = s.Length;
        int n2 = t.Length;
        if(n1!=n2){
            return false;
        }

        Dictionary<char , char> d = new Dictionary<char,char>();
        for(int i=0 ; i<n1 ; i++){
            if(!d.ContainsKey(s[i])){
                if(!d.ContainsValue(t[i])){
                    d.Add(s[i],t[i]);
                }else{
                    return false;
                }
                
            }else{
                if(d[s[i]] != t[i]){
                    return false;
                }
            }
        }
        return true;
    }
}