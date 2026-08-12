class Solution {
    Set<List<Integer>> res = new HashSet();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> temp = new ArrayList<>();
        solve(nums,temp,target);
        return new ArrayList<>(res);
    }

    public void solve(int[] nums,List<Integer> temp,int target){
        if(target == 0){
            List<Integer> validCombination = new ArrayList<>(temp);
            Collections.sort(validCombination);
            res.add(new ArrayList<>(validCombination));
        }
        if(target<0){
            return;
        }
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
            int diff = target-nums[i];
            solve(nums,temp,diff);
            temp.remove(temp.size()-1);
        }
    }
}
/*
[2,5,6,9]
*/