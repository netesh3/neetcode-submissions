class Solution {
        public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int max = 0;
        // for(int i=0;i<len;i++){
        //     int min = Integer.MAX_VALUE;
        //     for(int j=i;j<len;j++){
        //         if(heights[j]<min){
        //             min = heights[j];
        //         }
        //         int area = min*(j-i+1);
        //         max = Math.max(max,area);
        //     }
        // }

        Stack<int[]> stack = new Stack();
        int index = 0;
        for(int i=0;i<len;i++){
            index = i;
            while(!stack.isEmpty() && stack.peek()[1]>heights[i]){
                int pop[] = stack.pop();
                int ind = pop[0];
                int height = pop[1];
                max = Math.max(max,height*(i-ind));
                index = ind;
            }
            stack.push(new int[]{index,heights[i]});
        }
 
        while(!stack.isEmpty()){
            int pop[] = stack.pop();
            int ind = pop[0];
            int height = pop[1];
            max = Math.max(max,height*(len-ind));
        }

        return max;
    }
}

/*
[7,1,7,2,2,4]

 0 1 2 3 4 5 6 7 8
arr[] = [7,1,7,2,2,1,4,3,2]
         i
ans = 0;
formula = a[stack.pop()]* (i-index)



0,7
<index,arr[i]>


case 1: a[j]<stack.peek() then keep popping untile it's find the smaller element
and insert the index for pop element.

case 2: keep pushing the element if a[j]>stack.peek()

*/