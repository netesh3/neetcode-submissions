class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
         Map<Integer, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, 
                LinkedHashMap::new 
            ));
        int res[] = new int[k];
        int j=0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            res[j++]=entry.getKey();
            if(j==k){
                break;
            }
            //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        
        return res;
    }
}
