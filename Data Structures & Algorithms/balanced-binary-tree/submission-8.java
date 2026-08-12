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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;    
        }
        int res[] = new int[1];
        solve(root,res);
        return res[0] > 1? false:true;
    }

    public int solve(TreeNode root, int[] res){
        if(root == null){
            return 0;
        }
        int leftHeight = solve(root.left,res);
        int rightHeight = solve(root.right,res);
        res[0] = Math.max(res[0],Math.abs(leftHeight-rightHeight));
        return 1+Math.max(leftHeight,rightHeight);
    }

    // public int height(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int left = height(root.left);
    //     int right = height(root.right);
    //     return 1 + Math.max(left,right);
    // }
    
}
