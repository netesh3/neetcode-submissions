class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int i=0;
        int j=0;
        Map<Character,Integer> map = new HashMap<>();
        int maxFreq = 0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0) + 1);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(j))); 
            while((j-i+1)-maxFreq>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            for (int count : map.values()) {
                maxFreq = Math.max(maxFreq, count);
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}

// /*
// XYYX

// x
// y

// */
