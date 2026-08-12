class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for(int i=0;i<len;i++){
            int sum = 0;
            for(int j=i;j<i+len;j++){
                sum += nums[j%len];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
}