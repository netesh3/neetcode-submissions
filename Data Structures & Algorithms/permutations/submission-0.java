class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        solve(nums,set,temp);
        return res;
    }

    public void solve(int[] nums, Set<Integer> set, List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                temp.add(nums[i]);
                set.add(nums[i]);
                solve(nums,set,temp);
                temp.remove(temp.size()-1);
                set.remove(nums[i]);
            }
        }
    }
}
