class MinStack {
    
    Stack<Integer> st;
    Stack<Integer> min;
   
    public MinStack() {
      st = new Stack<>();
      min = new Stack<>();
    }
    
    public void push(int value) {
       st.push(value);
       if(min.isEmpty() || value <= min.peek()) min.push(value);
    }
    
    public void pop() {
        int x = st.pop();
       if ( x == min.peek()) min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       return min.peek();
    }
}



//TimeComplexity O(1);
//Space Compelxity O(n)