class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int max = 0;
        for(int num: nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            int count = 1;
            int check = nums[i];
            System.out.println(check);
            while(set.contains(check-1)){
                count++;
                check--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
