class Solution {

    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList();
        
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        
        int i=0;
        int end =0;
        int start = 0;
        while(i<s.length()){
            start++;
            end = Math.max(end,map.get(s.charAt(i)));
            if(end == i){
                res.add(start);
                start =0;
            }
            i++;
        }
        return res;
    }

    // public List<Integer> partitionLabels(String s) {
    //     List<Integer> res = new ArrayList();
    //     int i=0;
    //     while(i<s.length()){
    //         int start = i;
    //         int far = findLast(s,s.charAt(i),start);
    //         int j=i;
    //         while(j<far){
    //             int lastOfJ = findLast(s,s.charAt(j),j);
    //             if (lastOfJ > far) {
    //                 far = lastOfJ;
    //             }
    //             j++;
    //         }
    //         res.add(far-start+1);
    //         i = far+1;
    //     }
    //     return res;
    // }

    // public int findLast(String s, char c,int start){
    //     int last = start;
    //     for(int i=start;i<s.length();i++){
    //         if(s.charAt(i)==c){
    //            last = i; 
    //         }
    //     }
    //     return last;
    // }
}
