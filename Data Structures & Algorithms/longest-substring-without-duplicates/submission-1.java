class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        Set<Character> set = new HashSet();
        int i=0;
        int j=1;
        int res = 1;
        set.add(s.charAt(i));
        int n = s.length();
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                res = Math.max(set.size(),res);
                System.out.println(res + " : ");
                j++;
            }else{
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}
// abcabcbb
//      i i