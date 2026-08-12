/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max = 0;
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        List<Integer> res = new ArrayList();
        solve(root,1,res);
        return res;
    }

    public void solve(TreeNode root,int level,List<Integer> res){
        if(root == null){
            return;
        }
        if(level>max){
            res.add(root.val);
            max = level;
        }
        solve(root.right,level+1,res);
        solve(root.left,level+1,res);
    }
}
