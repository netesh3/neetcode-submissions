class Solution {
    Set<List<Integer>> res = new HashSet();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curr = new ArrayList();
        Arrays.sort(nums);
        solve(nums,0,curr);
        List<List<Integer>> res1 = new ArrayList();
        for(List<Integer> l: res){
            res1.add(l);
        }
        return res1;
    }
    public void solve(int[] nums, int i, List<Integer> curr){
        if(i==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve(nums,i+1,curr);
        curr.remove(curr.size()-1);
        solve(nums,i+1,curr);
    }
}
