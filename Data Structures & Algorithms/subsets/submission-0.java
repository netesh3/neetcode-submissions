class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList();
        solve(nums,0,curr);
        return res;
    }
    public void solve(int[] nums,int idx, List<Integer> curr){
        if(idx == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        solve(nums,idx+1,curr);
        curr.remove(curr.size()-1);
        solve(nums,idx+1,curr);
    }
}
