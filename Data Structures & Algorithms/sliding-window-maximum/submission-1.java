class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        
        List<Integer> res = new ArrayList();
        int i=0;
        int j=0;
        while(i<nums.length){
            pq.add(nums[i++]);
            if(pq.size()==k){
                res.add(pq.peek());
                pq.remove(nums[j++]);
            }
        }
        return res.stream().mapToInt(a -> a).toArray();
    }
}
