class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        solve(nums,set,temp);
        List<List<Integer>> resultList = new ArrayList<>(res);
        return resultList;
    }

    public void solve(int nums[],Set<Integer> set, List<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                temp.add(nums[i]);
                set.add(i);
                solve(nums,set,temp);
                temp.remove(temp.size()-1);
                set.remove(i);
            }
        }
    }
}