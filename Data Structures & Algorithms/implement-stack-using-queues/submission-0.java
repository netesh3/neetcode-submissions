class MyStack {
    Deque<Integer> dequeue = new ArrayDeque<>();
    public MyStack() {
        dequeue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        dequeue.addFirst(x);
    }
    
    public int pop() {
        return dequeue.poll();
    }
    
    public int top() {
        return dequeue.peek();
    }
    
    public boolean empty() {
        return dequeue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */