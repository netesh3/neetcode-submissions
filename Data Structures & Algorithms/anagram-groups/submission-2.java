class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(int i=0;i<strs.length;i++){
            int [] alphabet = new int[26];
            for(int j=0;j<strs[i].length();j++){
                alphabet[strs[i].charAt(j)-'a']++;
            }
            
            String key = Arrays.toString(alphabet);

            map.putIfAbsent(key,new ArrayList());
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
