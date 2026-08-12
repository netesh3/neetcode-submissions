class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String small = strs[0];
        String res = "";
        int j=0;
        while(j< small.length()){
            char c = small.charAt(j);
            for(int i=0;i<strs.length;i++){
                if(strs[i].charAt(j)!=c){
                   return res;
                }
            }
            res+=c;
            j++;
        }
        return res;
    }
}