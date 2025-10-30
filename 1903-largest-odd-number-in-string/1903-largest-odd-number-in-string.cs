public class Solution {
    public string LargestOddNumber(string num) {
        int ind=-1;
        StringBuilder sb = new StringBuilder();
        for(int i=num.Length-1 ; i>=0 ;i--){
            if(num[i]%2!=0){
                ind = i;
                break;
            }
        }
        for(int i=0 ; i<=ind ; i++){
            sb.Append(num[i]);
        }
        return sb.ToString();
    }
}