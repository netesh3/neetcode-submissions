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
    int res = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        solve(root,1);
        return res;
    }

    public void solve(TreeNode root,int level){
        if(root == null){
            return;
        }
        if(level>res){
            res = level;
        }
        solve(root.left,level+1);
        solve(root.right,level+1);
    }

    // public int solve(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int left = solve(root.left);
    //     int right = solve(root.right);
    //     return 1 + Math.max(left,right);
    // }
}
