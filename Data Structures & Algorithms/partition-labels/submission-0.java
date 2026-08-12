class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList();
        int i=0;
        while(i<s.length()){
            int start = i;
            int far = findLast(s,s.charAt(i),start);
            int j=i;
            while(j<far){
                int lastOfJ = findLast(s,s.charAt(j),j);
                if (lastOfJ > far) {
                    far = lastOfJ;
                }
                j++;
            }
            res.add(far-start+1);
            i = far+1;
        }
        return res;
    }

    public int findLast(String s, char c,int start){
        int last = start;
        for(int i=start;i<s.length();i++){
            if(s.charAt(i)==c){
               last = i; 
            }
        }
        return last;
    }
}
