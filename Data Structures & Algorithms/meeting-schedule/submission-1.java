/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int res[] = new int[1000001];
        for(Interval interval: intervals){
            int start = interval.start;
            int end = interval.end;
            for(int i = start;i<end;i++){
                res[i]+=1;
                if(res[i]>1){
                    return false;
                }
            }
        }
        return true;
    }
}


/*

[1,1,1,1,1,1,1,1]
(0,30),(50,100),(49,200)
[1,1,1,1,1,2,2,2,2,2,2...2,2,2,2,2,2......1]


*/