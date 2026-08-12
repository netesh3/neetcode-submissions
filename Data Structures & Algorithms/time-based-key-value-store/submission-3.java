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
        Map<Integer,String> value = map.get(key);
        System.out.println("1: "+ value +" timestamp: "+timestamp);
        String res = "";
        if(value.containsKey(timestamp)){
            res = value.get(timestamp);
            return res;
        }else{
            while(timestamp>=1){
                timestamp--;
                if(value.containsKey(timestamp)){
                    res = value.get(timestamp);
                    break;
                }
            }
        }
        return res;
    }
}
