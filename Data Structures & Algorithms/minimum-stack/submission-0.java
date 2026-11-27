class MinStack {
    private Deque<Integer> st= new ArrayDeque<>();
    private Deque<Integer> minst=new ArrayDeque<>();

    public MinStack() {
        st = new ArrayDeque<>();
        minst = new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()|| val<=minst.peek()){
            minst.push(val);
        }

        
    }
    
    public void pop() {
        int x=st.pop();
        if(x==minst.peek()){
            minst.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}
