class Solution {
    public boolean isAnagram(String s, String t) {
        int res[] = new int[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-97] +=1; 
        }
        System.out.println(Arrays.toString(res));
        for(int i=0;i<t.length();i++){
            if(res[t.charAt(i)-97] == 0){
                return false;
            }
            if(res[t.charAt(i)-97]!=0){
                res[t.charAt(i)-97] -=1;
            }            
        }
        System.out.println(Arrays.toString(res));
        for(int i=0;i<res.length;i++){
            if(res[i]>0){
                return false;
            }
        }
        return true;
    }
}
