class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxSum = 0;
        int minSum = 0;
        int len = nums.length;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            if(i<len){
                total+=nums[i];
            }
            if(maxSum<=0){
                maxSum = 0;
            }
            if(minSum>=0){
                minSum = 0;
            }
            maxSum +=nums[i];
            minSum +=nums[i];
            max = Math.max(maxSum,max);
            min = Math.min(minSum,min);
        }
        System.out.println(max + " : "+ min);
    
        if (max < 0) return max;

        return Math.max(max, total - min);
    }
}


/*

[1,2,3,4] = 

total = 10
maxSum = 10;
minSum = 1;

10-1 = 9

-2,4,-5,4,-5,9,4

total-max = 6
total-min =

total = 9 t
max= 15 s2
min= -6 s1

t= s1+s2
9 = -6+15
9-(-6) = 15
15
*/