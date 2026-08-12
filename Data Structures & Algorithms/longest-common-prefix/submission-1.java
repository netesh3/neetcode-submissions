class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length == 0){
        return ""; 
       }
       Arrays.sort(strs);
       String pick = strs[0];
       String res = "";
       for(int i=0;i<pick.length();i++){
            for(int j=0;j<strs.length;j++){
                if(pick.charAt(i)!=strs[j].charAt(i)){
                    return res;
                }
            }
            res+=pick.charAt(i);
       }
       return res;
    }
}