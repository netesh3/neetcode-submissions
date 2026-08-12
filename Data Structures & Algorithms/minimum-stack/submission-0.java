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
            }else{
                min.add(min.peek());
            }
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
