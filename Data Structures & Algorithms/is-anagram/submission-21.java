class Solution {
    public boolean isAnagram(String s, String t) {
        int res[] = new int[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-97] +=1; 
        }
        for(int j=0;j<t.length();j++){
            int idx = t.charAt(j)-97;
            if(res[idx]==0){
                return false;
            }
            res[idx]-=1;
        }
        for(int i=0;i<26;i++){
            if(res[i]>0){
                return false;
            }
        }
        return true;
    }
}
