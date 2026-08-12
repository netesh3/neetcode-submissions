class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str: strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }else{
                List<String> p = new ArrayList();
                p.add(str);
                map.put(s,p);
            }
        }
        List<List<String>> res = new ArrayList();
        for(List<String> list: map.values()){
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
