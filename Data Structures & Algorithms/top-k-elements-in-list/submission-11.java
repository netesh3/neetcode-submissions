class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList();

LinkedHashMap<Integer, Integer> sortedMap = map.entrySet().stream()
    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (e1, e2) -> e1,
        LinkedHashMap::new
    ));

        
        for(Map.Entry<Integer,Integer> m: sortedMap.entrySet()){
            if(k>0){
                list.add(m.getKey());
                k--;
            }else{
                break;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
