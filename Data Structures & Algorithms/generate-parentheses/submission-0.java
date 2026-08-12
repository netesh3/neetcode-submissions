class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        solve(n,sb);
        return res;
    }
    public boolean isValid(StringBuilder temp){
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
    public void solve(int n, StringBuilder temp){
        if(temp.length() == 2*n){
            if(isValid(temp)){
                res.add(new String(temp));
            }
            return;
        }

        temp.append("(");
        solve(n,temp);
        temp.deleteCharAt(temp.length() - 1);
        temp.append(")");
        solve(n,temp);
        temp.deleteCharAt(temp.length() - 1);
    }
}
