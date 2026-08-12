class Solution {
        public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int max = 0;
        for(int i=0;i<len;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j<len;j++){
                if(heights[j]<min){
                    min = heights[j];
                }
                int area = min*(j-i+1);
                max = Math.max(max,area);
            }
        }
        return max;
    }
}

/*
[7,1,7,2,2,4]
[7.1]


*/