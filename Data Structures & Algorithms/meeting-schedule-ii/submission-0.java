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
    public int minMeetingRooms(List<Interval> intervals) {
        int res[] = new int[1000001];
        int max = 0;
        for(Interval interval: intervals){
            int start = interval.start;
            int end = interval.end;
            for(int i = start;i<end;i++){
                res[i]+=1;
                if(res[i]>max){
                    max = res[i];
                }
            }
        }
        return max;
    }
}
