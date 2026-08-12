class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack();
    }
    
    public int next(int price) {
        int spam = 1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            spam +=stack.pop()[1];
        }
        stack.push(new int[]{price,spam});
        return spam;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

 /*

[100,80,60,70,60,75,85]
[1,   1, 1, 2, 1, 2, 3

100,1 | 85,6
*/
