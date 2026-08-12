/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        Map<Node,Node> map = new HashMap();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, new Node(node.val));

        while(!queue.isEmpty()){
            Node poll = queue.poll();
            for(Node neb: poll.neighbors){
                if(!map.containsKey(neb)){
                    map.put(neb,new Node(neb.val));
                    queue.add(neb);
                }
                map.get(poll).neighbors.add(map.get(neb));
            }
        }
        return map.get(node);
    }
}