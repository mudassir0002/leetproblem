class Solution {
    public int maxDifference(String s) {
        int arr[] = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            arr[ s.charAt(i) - 'a']++;
        }
        int maxodd = 0;
        int maxeven =0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                maxeven = Math.max(maxeven , arr[i]);
            }else{
                maxodd = Math.max(maxodd , arr[i]);
            }
        }
        if(maxodd-maxeven < 0){
            return -1;
        }else{
            return maxodd-maxeven;
        }
        
    }
}