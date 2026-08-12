class Solution {
    public String minWindow(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(tlen>slen){
            return "";
        }
        int ta[] = new int[256];

        for(int i=0;i<tlen;i++){
            ta[t.charAt(i)] +=1;
        }

        int min = slen;
        int start = -1;
        for(int i=0;i<=slen-tlen;i++){
            int sa[] = new int[256];
            for(int j=i;j<slen;j++){
                sa[s.charAt(j)] +=1;
                if(check(sa,ta)){
                    if(min>=j-i+1){
                        
                        min = j-i+1;
                        start = i;
                        System.out.println("start: "+ start +" min: "+ min);
                    }
                }
            }
        }
        return start ==-1?"":s.substring(start,start+min);
    }
    public boolean check(int[] sa, int[] ta){
        for(int i=0;i<sa.length;i++){
            if(ta[i]>sa[i]){
                return false;
            }
        }
        System.out.println("TT");
        return true;
    }
}
