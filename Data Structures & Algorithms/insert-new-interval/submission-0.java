class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList();
        int i=0;
        while(i<intervals.length){
            int[] curr = intervals[i];
            int cs = curr[0];
            int ce = curr[1];


            if(newInterval[0]>ce){
                res.add(new int[]{cs,ce});
            }else if(cs>newInterval[1]){
                break;
            }else{
                //merge
            
                newInterval[0] = Math.min(cs,newInterval[0]);
                newInterval[1] = Math.max(ce,newInterval[1]);
            }
            i++;
        }
        res.add(new int[]{newInterval[0],newInterval[1]});
        while(i<intervals.length){
            res.add(intervals[i]);
            i++;
        }
        int[][] finalArray = res.toArray(new int[res.size()][]);
        return finalArray;
    }
}
