class MinStack {
    private ArrayList<Integer> ls ;
    private int size=0;

    public MinStack() {
        ls = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        ls.add(val);
        size++;
    }
    
    public void pop() {
        if(size==0){
            return;
        }
        
        ls.remove(size-1);
        size--;
    }
    
    public int top() {
        if(size==0){
            return -1;
        }
        return ls.get(size-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<size ;i++){
            min = Math.min(min , ls.get(i));
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */