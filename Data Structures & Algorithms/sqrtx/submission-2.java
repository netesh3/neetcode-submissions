class Solution {
    public int mySqrt(int x) {
        long res = 0;
        long mul = 1;
        while(mul*mul<=x){
            res = mul;
            mul++;
        }
        return (int)res;
    }
}