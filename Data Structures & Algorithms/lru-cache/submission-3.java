class LRUCache {

    int size = 0;

    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        public Node(){

        }
        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer,Node> map = new HashMap();
    private Node head = new Node();
    private Node tail = new Node();

     public LRUCache(int capacity) {
        this.size = capacity;
        head.next = tail;
        tail.prev = head;
    }


    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insertAtFirst(node);
        return node.val;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==size){
            remove(tail.prev);
        }
        Node newNode = new Node(key,value);
        insertAtFirst(newNode);
    }

    public void remove(Node node){
        map.remove(node.key);
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next; // Removing the head
        }

        // Check if there is a node after this one
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev; // Removing the tail
        }
    }

    public void insertAtFirst(Node node){
        map.put(node.key,node);
        Node temp = head.next;
        
        head.next = node;
        node.prev = head;
        
        node.next = temp;
        temp.prev = node;
    }

}
/*
    [(2,6),(1,5)]
*/
