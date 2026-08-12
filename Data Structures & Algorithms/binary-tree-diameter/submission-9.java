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

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int[] gmax = new int[1];
        height(root,gmax);
        return gmax[0];
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

    public int height(TreeNode root,int[] gmax){
        if(root == null){
            return 0;
        }
        int left = height(root.left,gmax);
        int right = height(root.right,gmax);
        gmax[0] = Math.max(gmax[0],left+right);
        return 1+Math.max(left,right);
        
    }
}
