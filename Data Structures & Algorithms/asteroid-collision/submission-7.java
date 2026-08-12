class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for(int a: asteroids){
            while(!stack.isEmpty() && a<0 && stack.peek()>0){
                int sum = a+stack.peek();
                if(sum<0){
                    stack.pop();
                }else if(sum>0){
                    a=0;
                }else{
                    stack.pop();
                    a=0;
                }
            }
            if(a!=0){
                stack.push(a);
            }
        }
        
        int[] res = stack.stream() // creates a Stream<Integer>
                              .mapToInt(Integer::intValue) // maps to an IntStream (int primitives)
                              .toArray();
        return res;
    }
}