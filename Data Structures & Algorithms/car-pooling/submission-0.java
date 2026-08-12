class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] len = new int[1001];
        for(int[] trip: trips){
            int t[] = trip;
            int c = t[0];
            int start = t[1];
            int end = t[2];

            for(int i=start;i<end;i++){
                len[i] += c;
            }
        }
        for(int i=0;i<len.length;i++){
            if(len[i]>capacity){
                return false;
            }
        }
        return true;
    }
}