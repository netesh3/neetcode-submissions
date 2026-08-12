class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int remain=target-nums[j];
            if(map.containsKey(remain) && j != map.get(remain)){
                return new int[]{j,map.get(remain)};
            }
        }
        return nums;
    }
}
