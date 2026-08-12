class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                System.out.println(sum + " : "+max);
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }
}

/*
[2,-3,4,-2,2,1,-1,4]

*/