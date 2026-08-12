class FreqStack {
    Map<Integer,Integer> map;
    PriorityQueue<int[]> pq;
    int seq;
    public FreqStack() {
        pq = new PriorityQueue<>((a,b)-> {
            if(a[1] != b[1]){
                return b[1]-a[1];
            }else{
                return b[2]-a[2];
            }
        });
        map = new HashMap();
        seq = 0;
    }
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        seq++;
        int freq = map.get(val);
        int[] p = new int[]{val,freq,seq};
        pq.add(p);
    }
    
    public int pop() {
        if(!pq.isEmpty()){
            int[] max = pq.poll();
            if(max[1]==1){
                map.remove(max[0]);
            }else{
                map.put(max[0],max[1]-1);
            }
            return max[0];
        }
        return -1;
    }
}


// class FreqStack {
//     Map<Integer,Integer> map;
//     PriorityQueue<int[]> pq;
//     int seq;
//     public FreqStack() {
//         pq = new PriorityQueue<>((a,b)-> {
//             if(a[1] != b[1]){
//                 return b[1]-a[1];
//             }else{
//                 return b[2]-a[2];
//             }
//         });
//         map = new HashMap();
//         seq = 0;
//     }
//     public void push(int val) {
//         map.put(val, map.getOrDefault(val,0)+1);
//         // Store: {value, frequency, sequence_id}
//         pq.offer(new int[]{val, map.get(val), seq++});
//     }
    
//     public int pop() {
//         int[] top = pq.poll();
//         int val = top[0];
        
//         // Update the map so the NEXT push of this value 
//         // knows its new frequency.
//         map.put(val, map.get(val) - 1);
        
//         return val;
//     }
// }



/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */