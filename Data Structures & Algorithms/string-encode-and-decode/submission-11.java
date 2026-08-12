class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str: strs){
            String tmp = (str.length() + "#"+ str);
            res +=tmp;
        }
        return res;
    }
    //Hello# Wor#ld
    //6#Hello#6#Wor#ld
    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i=0;
        while(i<str.length()){
            int hashIndex = str.indexOf('#', i);
            int num = Integer.parseInt(str.substring(i, hashIndex));
            int stringStartIndex = hashIndex + 1;
            String sub = str.substring(stringStartIndex, stringStartIndex + num);
            result.add(sub);
            i = stringStartIndex + num;
        }
        
        return result;
    }   
}