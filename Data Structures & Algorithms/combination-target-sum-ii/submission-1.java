class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        solve(candidates, temp, target,0);
        return new ArrayList<>(res);
    }
    public void solve(int[] candidates,List<Integer> temp, int target,int idx){
        if(target == 0){
            List<Integer> t = new ArrayList<>(temp);
            Collections.sort(t);
            res.add(new ArrayList<>(t));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = idx; i<candidates.length;i++){
            // if(i>idx && candidates[i]==candidates[i-1]){
            //     continue;
            // }
            temp.add(candidates[i]);
            solve(candidates,temp,target-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
