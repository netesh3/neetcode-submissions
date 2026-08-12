class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
         PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (e1, e2) -> e2.getValue().compareTo(e1.getValue()) 
        );
        maxHeap.addAll(map.entrySet());
        int res[] = new int[k];
        int j=0;
        while(k>0){
            res[j++]=maxHeap.poll().getKey();
            k--;
        }
        return res;
    }
}
