class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        int res = 0;
        int total = 0;
        for(int i=0;i<gas.length;i++){
            if(totalgas<totalcost){
                return -1;
            }
            total = (total+gas[i])-cost[i];
            if(total<0){
                total = 0;
                res = i+1;
            }
        }
        return res;
    }
}
