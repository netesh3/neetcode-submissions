class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num: nums){
            set.add(num);
        }
        int max = 0;
        for(int num: nums){
            int count = 0;
            while(true){
                if(!set.contains(num)){
                    break;
                }
                num--;
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
