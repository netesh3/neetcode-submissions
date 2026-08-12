class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if((!(str.charAt(i) >= '0' && str.charAt(i)<='9')) && (str.charAt(i)<97 || str.charAt(i)>123)){
                System.out.println("Test");
                i++;
                continue;
            }
            if((!(str.charAt(j) >= '0' && str.charAt(j)<='9')) && (str.charAt(j)<97 || str.charAt(j)>123)){
                j--;
                continue;
            }
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

/*

97
26
===
123
*/