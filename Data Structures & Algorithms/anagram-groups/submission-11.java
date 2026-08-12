class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap();
       for(int i=0;i<strs.length;i++){
        char[] charArray = strs[i].toCharArray();
        Arrays.sort(charArray);
        String s = new String(charArray);
        map.computeIfAbsent(s,v->new ArrayList()).add(strs[i]);
       }
       return new ArrayList<>(map.values()); 
    }
}
