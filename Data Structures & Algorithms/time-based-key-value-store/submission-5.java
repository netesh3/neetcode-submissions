class TimeMap {
    Map<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,v->new TreeMap()).put(timestamp,value);
        System.out.println(map);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        TreeMap<Integer,String> value = map.get(key);
        System.out.println("1: "+ value +" timestamp: "+timestamp);

        Integer closestKey = value.floorKey(timestamp);
        if(closestKey == null){
            return "";
        }
        return value.get(closestKey);
    
    }
}


/*

1,2
6,8
7,10
9,11

map.floorKey(5) -> 3

*/