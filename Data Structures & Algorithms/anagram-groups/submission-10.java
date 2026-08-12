class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap();
       for(int i=0;i<strs.length;i++){
        char ch[] = strs[i].toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
       
        map.computeIfAbsent(key, v->new ArrayList()).add(strs[i]);
        //map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);

        // if(map.containsKey(key)){
        //     List<String> value = map.get(key);
        //     value.add(strs[i]);
        //     map.put(key,value);
        // }else{
        //      List<String> list = new ArrayList();
        //      list.add(strs[i]);
        //      map.put(key, list);
        // }
       }
       return new ArrayList(map.values());
    }
}
