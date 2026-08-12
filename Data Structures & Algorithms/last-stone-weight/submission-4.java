class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        System.out.println(pq.size() + " S");
        while(pq.size()>=2){
            int x = pq.poll();
            int y = pq.poll();
            if(x == y){
                continue;
            }
            int z = x-y;
            pq.add(z);
        }
        return pq.size() == 0? 0: pq.peek();
    }
}

/*

3,7,8
4,8
4

[2,3,6,2,4]

[1,6,2,4]
[5,2,4]
[3,4]
[1]

*/