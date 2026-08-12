class MyHashMap {
    int map[][];
    public MyHashMap() {
        map = new int[1000001][2];
        for (int i = 0; i < map.length; i++) {
            map[i][0] = -1;
            map[i][1] = -1;
        }
    }
    
    public void put(int key, int value) {
        map[key][1] = value;
    }
    
    public int get(int key) {
        return map[key][1];
    }
    
    public void remove(int key) {    
        map[key][0] = -1;
        map[key][1] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */