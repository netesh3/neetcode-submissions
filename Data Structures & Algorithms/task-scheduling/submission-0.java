class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap();
        for(char c: tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Task> maxHeap = new PriorityQueue<>((a, b) -> b.count - a.count);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.add(new Task(entry.getKey(), entry.getValue()));
        }
        List<Character> list = new ArrayList();
        Queue<Task> queue = new LinkedList();
        while(!maxHeap.isEmpty()){
            int i = n;
            while(i>=0 && !maxHeap.isEmpty()){
                queue.add(maxHeap.poll());
                i--;
            }
            int cool = n;
            while(cool>=0){
                if(!queue.isEmpty()){
                    Task poll = queue.poll();
                    if(poll.count>1){
                        int newcount = poll.count;
                        Task task = new Task(poll.c, newcount-1);
                        maxHeap.add(task);
                    }
                    list.add(poll.c);
                }else{
                    if(!maxHeap.isEmpty()){
                        list.add(null);
                    }
                }
                cool--;
            }
        }
        return list.size();

    }

    static class Task{
        char c;
        int count;
        public Task(char c,int count){
            this.c = c;
            this.count = count;
        }
    }
}

/*

A-2
C-2
[A,B,C,-,A,B,C,-,A,B,-,-,-,-]
*/
