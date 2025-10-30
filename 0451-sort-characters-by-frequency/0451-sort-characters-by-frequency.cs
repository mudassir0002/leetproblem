public class Solution {
    public string FrequencySort(string s) {
        Dictionary<char , int> d = new Dictionary<char , int>();
        for(int i=0 ; i<s.Length ; i++){
            if(!d.ContainsKey(s[i])){
                d.Add(s[i] , 1);
            }else{
                d[s[i]] +=1;
            }
        }
        var orderof = d.OrderByDescending(pair => pair.Value);
        StringBuilder sb = new StringBuilder();

        foreach(var kv in orderof){
            for(int i=0 ; i<kv.Value ; i++){
                sb.Append(kv.Key);
            }
        }
        return sb.ToString();

    }
}