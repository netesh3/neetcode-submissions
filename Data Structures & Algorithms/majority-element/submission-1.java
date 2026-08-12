class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res = 0;
        int count = 0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>count){
                count = m.getValue();
                res = m.getKey();
            }
        }
        return res;
    }
}