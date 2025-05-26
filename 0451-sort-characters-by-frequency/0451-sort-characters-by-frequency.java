class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int max=0;
        int ind=0;
        for (int i = 0; i < 256; i++) {
            for(int j=0 ; j<256 ; j++){
                if(max<arr[j]){
                    max = arr[j];
                    ind = j;
                }
            }
            for(int k=0 ; k<max ; k++){
                sb.append((char)ind);
            }
            arr[ind]=0;
            max=0;
            ind=0;
        }
        return sb.toString();
    }
}