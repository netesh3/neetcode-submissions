class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str: strs){
            res += (str + "#"+ str.length());
        }
        System.out.println(res);
        return res;
    }
    //Hello#5World#5
    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = str.length()-1;
        System.out.println("Test");
        while(i>=0){
            
            String num = "";
            while(str.charAt(i)!='#'){
                num =str.charAt(i)+num;
                i--;
            }
            System.out.print("num "+num +" ");
            Integer parsedNum = Integer.parseInt(num);
            System.out.print("parsedNum "+parsedNum +" ");
            int index = i-parsedNum;
            System.out.print("index "+parsedNum +" ");
            String temp = str.substring(index,i);
            System.out.print("temp "+temp +" ");
            result.add(0,temp);
            i = index;
            System.out.println();
            i--;
        }
        return result;
    }   
}
