class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(char s1 : s.toCharArray()){
            int index = s1 - 'a';
            arr[index] += 1; 
        }
        for(char t1 : t.toCharArray()){
            int index = t1 - 'a';
            if(arr[index] > 0){
                arr[index] -= 1; 
            }else{
                return false;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
}
