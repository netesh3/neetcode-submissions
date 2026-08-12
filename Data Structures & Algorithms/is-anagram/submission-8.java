class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for(char s1 : s.toCharArray()){
            map.put(s1,map.getOrDefault(s1,0)+1);
        }
        for(char t1: t.toCharArray()){
            if(map.containsKey(t1)){
                int value = map.get(t1);
                if (value == 1){
                    map.remove(t1);
                }else { 
                    map.put(t1, value-1);
                }
            }else {
                return false;
            }
        }
        return map.isEmpty();
    }
}
