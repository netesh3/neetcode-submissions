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
   
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        return solve(root,res);
        //return res;
    }

    // public void solve(TreeNode root,List<Integer> res){
    //     if(root == null){
    //         return;
    //     }
    //     solve(root.left,res);
    //     res.add(root.val);
    //     solve(root.right,res);
    // }

    public List<Integer> solve(TreeNode root,List<Integer> res){
        if(root == null){
            return res;
        }
        solve(root.left,res);
        res.add(root.val);
        solve(root.right,res);
        return res;
    }
}