class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] str = s1.toCharArray();
        Arrays.sort(str);
        String str1 = new String(str);
        int j=str1.length()-1;
        for(int i=0;i<s2.length() && j<s2.length();i++){
            String sub = s2.substring(i,j+1);
            System.out.println(sub +" i: "+ i +" j: "+j);
            char subArr[] = sub.toCharArray();
            Arrays.sort(subArr);
            String newSub = new String(subArr);
            if(str1.equals(newSub)){
                return true;
            }
            j++;; 
        }
        return false;
    }
}
/* 
lecabee
0123456
*/
