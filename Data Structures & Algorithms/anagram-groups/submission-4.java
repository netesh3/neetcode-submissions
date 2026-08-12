class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(int i = 0;i< strs.length;i++){
            int[] key = new int[26];
            String str = strs[i];
            for(int j = 0;j< str.length();j++){
                key[str.charAt(j)-'a']++;
            }
            String finalKey = Arrays.toString(key);
            if(map.containsKey(finalKey)){
                List<String> val = map.get(finalKey);
                val.add(str);
                map.put(finalKey,val);
            }else{
                List<String> list = new ArrayList();
                list.add(str);
                map.put(finalKey,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
