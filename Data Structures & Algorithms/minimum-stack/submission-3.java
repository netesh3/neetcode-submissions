class MinStack {
Stack<Integer> stack;
Stack<Integer> min;
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }
    
    public void push(int val) {
        stack.add(val);
        if(min.isEmpty()){
            min.add(val);
        }else{
            if(val<=min.peek()){
                min.add(val);
            }
        }
    }
    
    public void pop() {
        int popped = stack.pop();
        if(popped==min.peek()){
            min.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
