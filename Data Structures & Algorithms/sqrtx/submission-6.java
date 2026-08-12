class Solution {
    public int mySqrt(int x) {
        int res = 0;
        int start = 0;
        int end = x;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((long)mid*mid>x){
                end = mid-1;
            }else if((long)mid*mid<x){
                start = mid+1;
                res = mid;
            }else{
                return mid;
            }
        }
        return res;
    }
}