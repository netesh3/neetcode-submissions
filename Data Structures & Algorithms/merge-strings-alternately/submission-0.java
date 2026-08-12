class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(),word2.length());
        int i=0;
        String res = "";
        while(i<min){
            res += word1.charAt(i);
            res +=word2.charAt(i);
            i++;
        }
        while(i<word1.length()){
            res +=word1.charAt(i);
            i++;
        }while(i<word2.length()){
            res +=word2.charAt(i);
            i++;
        }
        return res;
    }
}