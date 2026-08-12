class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i: nums){
            pq.add(i);
        }
        int last = Integer.MIN_VALUE;
        while(k>0){
            last = pq.poll();
            k--;
        }
        return last;
    }
}
