class MyStack {
    public Queue<Integer> firstQueue;
    public Queue<Integer> secondQueue;

    public MyStack() {
        //Constructor 
        firstQueue = new LinkedList<>();
        secondQueue = new LinkedList<>();
        
    }
    
    public void push(int x) {
        //Move all elements from firstQueue to secondQueue.
        while(firstQueue.size()>0){
            secondQueue.add(firstQueue.remove());
        }
        //Add the new element x to the now-empty firstQueue.
        firstQueue.add(x);

        //Move all elements back from secondQueue to firstQueue.
        while(secondQueue.size()>0){
            firstQueue.add(secondQueue.remove());
        }
    }
    
    public int pop() {
        //Removes and returns the top element of the stack.
        return firstQueue.remove();
        
    }
    
    public int top() {
        //Returns the top element of the stack without removing it.
        return firstQueue.peek();
        
    }
    
    public boolean empty() {
        if(firstQueue.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
}
