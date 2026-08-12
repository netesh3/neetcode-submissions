class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adj = new HashMap();
        int[] indegree = new int[numCourses];
        for(int[] pre: prerequisites){
            int u = pre[0];
            int v = pre[1];
            adj.computeIfAbsent(v, value->new ArrayList()).add(u);
            indegree[u]++;
        }
        List<Integer> res = new ArrayList();
        Queue<Integer> queue = new LinkedList();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int poll = queue.poll();
            res.add(poll);
            if(adj.containsKey(poll)){
                for(int neb: adj.get(poll)){
                    indegree[neb]--;
                    if(indegree[neb] == 0){
                        queue.add(neb);
                    }
                }
            }
        }
        int r[] = res.stream().mapToInt(i->i).toArray();
        return r.length==numCourses? r: new int[]{};
    }
}
