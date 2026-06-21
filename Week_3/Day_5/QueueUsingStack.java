class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> temp;
    public MyQueue() {
        st1 = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            temp.push(st1.pop());
        }
        int poppedItem = temp.pop();
        while(!temp.isEmpty()){
            st1.push(temp.pop());
        }
        return poppedItem;
    }
    
    public int peek() {
        return st1.get(0);
    }
    
    public boolean empty() {
        return st1.size() == 0?true:false;
    }
}

