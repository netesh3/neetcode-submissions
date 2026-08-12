class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
