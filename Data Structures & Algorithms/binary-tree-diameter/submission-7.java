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
    int gmax = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        height(root);
        return gmax;
    } 

    // public void solve(TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     gmax = Math.max(gmax,leftHeight+rightHeight);
    //     solve(root.left);
    //     solve(root.right);
    // }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        gmax = Math.max(gmax,left+right);
        return 1+Math.max(left,right);
        
    }
}
