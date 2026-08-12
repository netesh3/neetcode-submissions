class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        String res = "";
        for(int i=0;i<w1 || i<w2;i++){
            if(i<w1){
                res += word1.charAt(i);
            }
            if(i<w2){
                res +=word2.charAt(i);
            }
        }
        return res;
    }
}