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
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        
        for(int i=1;i<intervals.size();i++){
            Interval one = intervals.get(i-1);
            Interval two = intervals.get(i);
            if(one.end>two.start){
                return false;
            }
        }
        return true;
    }
}


/*

(0,30),(5,10),(15,20)


[1,1,1,1,1,1,1,1]
(0,30),(50,100),(49,200)
[1,1,1,1,1,2,2,2,2,2,2...2,2,2,2,2,2......1]


*/