class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize !=0){
            return false;
        }
        Arrays.sort(hand);
        Map<Integer,Integer> map = new HashMap();
        for(int num: hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num: hand){
            if(map.get(num)>0){
                for(int i=num;i<num+groupSize;i++){
                    if(!map.containsKey(i)){
                        return false;
                    }
                    if(map.get(i)<=0){
                        return false;
                    }
                    map.put(i,map.getOrDefault(i,0)-1);
                }
            }
        }
        return true;
    }
}
