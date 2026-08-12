class Solution {
    public int countComponents(int n, int[][] edges) {
        
        Map<Integer,List<Integer>> adjList = new HashMap();
        //Adj List;
        for(int i=0;i<edges.length;i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            adjList.computeIfAbsent(v1, v->new ArrayList()).add(v2);
            adjList.computeIfAbsent(v2, v->new ArrayList()).add(v1);
        }

        Map<Integer,Boolean> visited = new HashMap();
        for(int i=0;i<n;i++){
            visited.put(i,false);
        }
        
        Queue<Integer> queue = new LinkedList();
        
        int res = 0;
        for(int i=0;i<n;i++){
            if(visited.get(i)==false){
                queue.add(i);
                res++;
            }   
            while(!queue.isEmpty()){
                int poll = queue.poll();
                visited.put(i,true);
                List<Integer> lists = adjList.get(poll);
                if(lists !=null){
                    for(int num: lists){
                        if(visited.get(num)==false){
                            queue.add(num);
                            visited.put(num,true);
                        }
                    }
                }
            }
        }
    return res;
    }
}



/*

[
0->[1]
1->[0,2]
2->[1]
3->[4]
4->[3]
]

edges = [
            [0,1],
            [1,2],
            [3,4]
        ]

*/