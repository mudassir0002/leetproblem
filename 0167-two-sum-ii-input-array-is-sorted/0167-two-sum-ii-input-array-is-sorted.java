class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        int flag=0;
        for(int i=0 ;i<numbers.length-1 ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                if(numbers[i]+numbers[j]==target){
                    result[0] = i+1;
                    result[1] = j+1;
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
            flag=0;
        }
        return result;
    }
}