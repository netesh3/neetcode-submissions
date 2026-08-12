class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int max = 0;
        for(int num: nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            int check = nums[i];
            int count = 1;
            while(set.contains(check-1)){
                count++;
                check--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
