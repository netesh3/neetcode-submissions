class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int len = nums.length;
        List<Integer> res = new ArrayList();
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            int key = m.getKey();
            int value = m.getValue();
            System.out.println(value);
            System.out.println(" T "+len/3);
            if((len/3)<value){
                res.add(key);
            }
        }
        return res;
    }
}