class MedianFinder {
    PriorityQueue<Integer> pq1;
    PriorityQueue<Integer> pq2;
    public MedianFinder() {
        pq1 = new PriorityQueue<>((a,b) -> b-a);
        pq2 = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        pq1.offer(num);
        pq2.offer(pq1.poll());
        
        if(pq1.size()<pq2.size()){
            pq1.offer(pq2.poll());  
        }
    }
    
    public double findMedian() {
        if(pq1.size()>pq2.size()){
            return pq1.peek();
        }else {
            System.out.println("MID:" + pq1.peek() + " : "+ pq2.peek());
            return (pq1.peek()+pq2.peek())/2.0;
        }
    }
}
