class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int j=0;j<t.length();j++){
            if(map.containsKey(t.charAt(j))){
                int c = map.get(t.charAt(j));
                if(c==1){
                    map.remove(t.charAt(j));
                }else{
                    map.put(t.charAt(j),c-1);
                }
            }else{
                map.put(t.charAt(j),1);
            }
        }
        if(map.size()>0){
            return false;
        }
        return true;
    }
}
