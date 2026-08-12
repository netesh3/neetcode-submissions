class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> map = new HashMap();
        Set<Integer> out = new HashSet();
        int row = trust.length;
        int col = trust[0].length;
        for(int i=0;i<row;i++){
            int person = trust[i][0];
            System.out.println("person " + person);
            out.add(person);
            int trustTo = trust[i][1];
            map.put(trustTo, map.getOrDefault(trustTo,0)+1);
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()==n-1 && !out.contains(m.getKey())){
                return m.getKey();
            }
        }
        return -1;
    }
}