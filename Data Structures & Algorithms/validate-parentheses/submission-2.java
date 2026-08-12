class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                 if(c == ')'){
                    char peek = stack.peek();
                    if(peek != '('){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else if(c == '}'){
                   char peek = stack.peek();
                    if(peek != '{'){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else if(c == ']') {
                    char peek = stack.peek();
                    if(peek != '['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
