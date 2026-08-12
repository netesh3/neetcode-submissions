class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println("M "+ map);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]) !=i &&Math.abs(map.get(nums[i])-i)<=k){
                System.out.println( "N " + nums[i] +" T "+map.get(nums[i]) + " : "+i);
                return true;
            }
        }
       return false;
    }
}