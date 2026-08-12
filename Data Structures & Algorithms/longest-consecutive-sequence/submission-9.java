class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int max = 0;
        int len = nums.length;
        for(int i=0;i<nums.length-1;){
            int count = 1;
            while(i<len-1 && (nums[i] == nums[i+1]-1 || nums[i]==nums[i+1])){
                if(nums[i]==nums[i+1]){
                    i++;
                    continue;
                }
                count++;
                i++;
            }
            max = Math.max(count,max);
            i++;
        }
        return max;
    }
}
