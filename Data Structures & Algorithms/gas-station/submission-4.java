class Solution {
    // public int canCompleteCircuit(int[] gas, int[] cost) {
    //     int totalgas = 0;
    //     int totalcost = 0;
    //     for(int i=0;i<gas.length;i++){
    //         totalgas+=gas[i];
    //         totalcost+=cost[i];
    //     }
    //     int res = 0;
    //     int total = 0;
    //     for(int i=0;i<gas.length;i++){
    //         if(totalgas<totalcost){
    //             return -1;
    //         }
    //         total = (total+gas[i])-cost[i];
    //         if(total<0){
    //             total = 0;
    //             res = i+1;
    //         }
    //     }
    //     return res;
    // }


     public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for(int i=0;i<n;i++){
            int tank = gas[i]-cost[i];
            if(tank<0) continue;

            int j = (i+1)%n;
            while(j!=i){
                tank = (tank+gas[j])-cost[j];
                if(tank<0) break;
                j = (j+1)%n;
                if(j==i){
                    return i;
                }
            }
            if(j==i){
                    return i;
            }
            
        }
        return -1;
    }
}
