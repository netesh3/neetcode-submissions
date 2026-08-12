class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char t1: t.toCharArray()){
            if(map.containsKey(t1)){
                int val = map.get(t1);
                if(val==1){
                    map.remove(t1);
                }else{
                    map.put(t1,val-1);
                }   
            }else{
                return false;
            }
        }
        return map.size()==0;
    }
}
