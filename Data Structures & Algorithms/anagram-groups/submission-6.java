class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap();
       for(String str: strs){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        if(map.containsKey(s)){
            List<String> value = map.get(s);
            value.add(str);
            map.put(s,value);
        }else{
            List<String> list = new ArrayList();
            list.add(str);
            map.put(s,list);
        }
       }
        List<List<String>> result = new ArrayList();
        for(Map.Entry<String,List<String>> entrySet: map.entrySet()){
            result.add(entrySet.getValue());
        }

       return result;
    }
}
