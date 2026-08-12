class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int i=0;
        int j=1;
        int res = 0;
        while(j<intervals.length){
            int[] curr = intervals[i];
            int[] next = intervals[j];
            System.out.println(Arrays.toString(curr) + " : "+ Arrays.toString(next));
            int cs = curr[0];
            int ce = curr[1];
            int ns = next[0];
            int ne = next[1];
            System.out.println(cs +","+ce + " | "+ ns +","+ne);
            if(ns>=ce){
                i = j;
                j++;
            }else if(ce<=ne){
                j++;res++;
            }else if(ce>ne){
                i = j;
                j++; res++;
            }
        }
        return res;
    }
}
