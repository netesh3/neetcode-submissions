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
    int res = 1;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);  
        int right = maxDepth(root.right);
        return 1+Math.max(left,right);  
    }

/*

2
1
*/


    // public void solve(TreeNode root, int level){
    //     if(root == null){
    //         return;
    //     }
    //     res = Math.max(level,res);
    //     solve(root.left, level+1);
    //     solve(root.right, level+1);
    // }
}
