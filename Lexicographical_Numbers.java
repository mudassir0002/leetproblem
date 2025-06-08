class Solution {
    public List<Integer> lexicalOrder(int n) {

        List <Integer> list = new ArrayList<>();
        for(int i=1 ; i<=9 ; i++){
            helper(n,list,i);
        }
        return list;
    }
    public void helper(int n,List<Integer> list,int curr){
        if(curr>n){
            return ;
        }

        list.add(curr);
        for(int i=0 ; i<=9 ; i++){
            helper(n,list,curr*10 + i);
        }
    }
}