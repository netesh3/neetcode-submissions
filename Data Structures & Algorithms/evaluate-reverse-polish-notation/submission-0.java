class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String str: tokens){
            if(str.equals("+") || str.equals("-")  || str.equals("*") ||str.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(str.equals("+")){
                    int res = num1+num2;
                    stack.add(res);
                }else if(str.equals("-")){
                    int res = num2-num1;
                    stack.add(res);

                }else if(str.equals("*")){
                    int res = num1*num2;
                    stack.add(res);
                }else if (str.equals("/")){
                    int res = num2/num1;
                    stack.add(res);
                }
            }else{
                System.out.println("eee" + str);
                stack.add(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }
}
