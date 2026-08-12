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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        solve(root,max);
        return count;
    }

    public void solve(TreeNode root, int max){
        if(root == null){
            return;
        }

        if(root.val>=max){
            count++;
        }

        if(max<=root.val){
            max = root.val;
        }
        solve(root.left,max);
        solve(root.right,max);
    }
}


/*
[2,1,3]
[2,1,1]
[2,1,5]

[1,2,3]
[1,2,4]
[1,-1]


*/