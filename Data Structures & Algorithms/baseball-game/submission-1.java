class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for(String op: operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                List<Integer> list = new ArrayList();
                int peek = stack.peek();
                stack.push(peek*2);
            }else if(op.equals("+")){
                int pop = stack.pop();
                int peek = stack.peek();
                int sum = pop+peek;

                stack.push(pop);
                stack.push(sum);
                
            }else{
                stack.push(Integer.parseInt(op));
                
            }
        }
        int res = 0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}