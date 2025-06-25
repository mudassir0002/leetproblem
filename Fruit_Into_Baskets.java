class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int cnt=0;
        int n = fruits.length;
        if(n==0 || n==1 || n==2){
            return n;
        }
        for(int i=0 ; i<n ;i++){
            boolean flag=false;
            cnt=0;
            for(int j=i+1 ;j<n-1 ; j++){
                if(fruits[i]==fruits[j]){
                    cnt=cnt+1;
                }else if(fruits[i]!=fruits[j] && flag==false){
                    flag=true;
                    cnt=cnt+1;
                }else{
                    break;
                }
                max = Math.max(cnt , max);
            }
            
        }
        return max+2;
    }
}
