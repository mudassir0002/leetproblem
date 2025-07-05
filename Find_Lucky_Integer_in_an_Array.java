class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int a[] = new int[1000];
        for(int i=0 ; i<arr.length ; i++){
            a[arr[i]]++;
        }
        int cnt=0;
        for(int i=0 ; i<a.length ; i++){
            if(a[i]==i){
                cnt=i;
            }
        }
        if(cnt==0){
            return -1;
        }else{
            return cnt;
        }
        
    }
}