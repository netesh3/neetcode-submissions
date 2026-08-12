class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        for(int i = temperatures.length-1;i>=0;i--){
            int num = temperatures[i];
            while(!stack.isEmpty() && num >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty() && num<temperatures[stack.peek()]){
                res[i] = stack.peek()-i;
                stack.add(i);
            }else{
                stack.add(i);
                res[i]= stack.peek()-i;
            }
        }
        return res;
    }
}


/*

*/