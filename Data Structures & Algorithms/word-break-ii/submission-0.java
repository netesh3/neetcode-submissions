class Solution {
    Set<String> set;
    List<String> res;
    public List<String> wordBreak(String s, List<String> wordDict) {
        set = new HashSet();
        res = new ArrayList();
        for(String word: wordDict){
            set.add(word);
        }
        List<String> curr = new ArrayList();
        solve(s,0,curr);
        return res;
    }

    public void solve(String s, int i, List<String> curr){
        if(i == s.length()){
            res.add(String.join(" ",curr));
            return;
        }

        for(int j=i;j<s.length();j++){
            String w = s.substring(i,j+1);
            if(set.contains(w)){
                curr.add(w);
                solve(s,j+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}