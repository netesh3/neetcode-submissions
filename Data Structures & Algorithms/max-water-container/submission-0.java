class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int total = (j-i)*Math.min(heights[i],heights[j]);
            if(total>max){
                max = total;
            }
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}

/*

max = 36;
[1,7,2,5,4,7,3,6]
   i         j

total = (j-i) * Math.min(a[i],a[j]); -> 7 -> 36


*/