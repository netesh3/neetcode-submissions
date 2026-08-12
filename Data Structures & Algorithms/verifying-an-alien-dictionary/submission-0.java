class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] a = new int[26];
        for(int i=0;i<order.length();i++){
            a[order.charAt(i)-'a'] = i;
        }

        for(int i=0;i<words.length-1;i++){
            String a1 = words[i];
            String a2 = words[i+1];
            int j=0;
            for(;j<a1.length();j++){
                if(j>=a1.length() || j>=a2.length()){
                    return false;
                }
                if(a1.charAt(j)!=a2.charAt(j)){
                    if(a[a1.charAt(j)-'a']>a[a2.charAt(j)-'a']){
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}