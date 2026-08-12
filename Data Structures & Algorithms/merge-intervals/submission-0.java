class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        int j=1;
        List<int[]> res = new ArrayList();
        int[] start = intervals[i];
        res.add(new int[]{start[0],start[1]});
        
        while(j<intervals.length){
            int[] curr = res.get(res.size()-1);
            int[] next = intervals[j];
            int cs = curr[0];
            int ce = curr[1];
            int ns = next[0];
            int ne = next[1];

            if((ce>=ns)){
                //merge
                int[] temp = res.get(res.size()-1);
                res.remove(res.size()-1);
                res.add(new int[]{Math.min(temp[0],ns),Math.max(temp[1],ne)});
                j++;
            }else{
                res.add(new int[]{ns,ne});
            }
        }
        int[][] finalArray = res.toArray(new int[res.size()][]);
        return finalArray;
    }
}

/*

> merge only when 
    > cs and ce are in between ns and ne
    > ns and ne are in between cs and ce

    if ce<=ns -> i = j and j++
    if ce>=n

*/