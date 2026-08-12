class Solution {
    /* It's a topological sort problem */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adj = new HashMap();
        int[] indegree = new int[numCourses];
        for(int[] pre: prerequisites){
            int u = pre[0];
            int v = pre[1];
            adj.computeIfAbsent(v, value->new ArrayList()).add(u);
            indegree[u]++;
        }
        System.out.println("adj: "+adj);
        System.out.println("indegree: "+Arrays.toString(indegree));

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }

        int total = 0;
        while(!queue.isEmpty()){
            int poll = queue.poll();
            total++;
            if(adj.containsKey(poll)){
                for(int neb: adj.get(poll)){
                    indegree[neb]--;
                    if(indegree[neb]==0){
                        queue.add(neb);
                    }
                }
            }
            
        }

        return total == numCourses;
    }
}
