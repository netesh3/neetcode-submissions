class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> curr = new ArrayList();
        solve(1,n,k,curr);
        return res;
    }
    public void solve(int start,int n, int k, List<Integer> curr){
        if(k==0){
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            solve(i+1,n,k-1,curr);
            curr.remove(curr.size()-1);
        }
    }
    // public void solve(int start,int n, int k, List<Integer> curr){
    //     if(k==0){
    //         res.add(new ArrayList(curr));
    //         return;
    //     }
    //     if(start>n){
    //         return;
    //     }
    //     curr.add(start);
    //     solve(start+1,n,k-1,curr);
    //     curr.remove(curr.size()-1);
    //     solve(start+1,n,k,curr);
    // }
}