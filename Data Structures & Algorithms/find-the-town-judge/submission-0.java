class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> map = new HashMap();
        Set<Integer> out = new HashSet();
        int row = trust.length;
        int col = trust[0].length;
        for(int i=0;i<row;i++){
            int person1 = trust[i][0];
            System.out.println("person1 " + person1);
            out.add(person1);
            int person2 = trust[i][1];
            map.put(person2, map.getOrDefault(person2,0)+1);
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()==n-1 && !out.contains(m.getKey())){
                return m.getKey();
            }
        }
        return -1;
    }
}