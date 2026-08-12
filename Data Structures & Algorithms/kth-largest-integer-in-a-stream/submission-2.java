class KthLargest {
    PriorityQueue<Integer> pq;
    int size = 0;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue();
        size = k;
        int i=0;
        while(i<nums.length){
            pq.add(nums[i]);
            i++;
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>size){
            pq.poll();
        }
        
        return pq.peek();
    }
}
/*
     1,2,3,3 ->3
a[3] 3,3,3 -> 3 : 
a[5] 3,3,5 -> 3
a[6] 3,5,6 -> 3
a[7] 5,6,7 -> 5
a[8] 6,8,8 -> 6

[4, 5, 8, 2]
[2,4,5,8]

*/