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
    public int kthSmallest(TreeNode root, int k) {
        // List<Integer> res = new ArrayList();
        // solve(root,res);
        // System.out.println(List.of(res));
        // return res.get(k-1);

        int res[] = new int[2];
        res[0] = k;
        solve(root,res);
        return res[1];
    }

    public void solve(TreeNode root,int[] res){
        if(root == null){
            return;
        }
        solve(root.left,res);
        res[0]--;
        if(res[0]==0){
            res[1] = root.val;
        }
        solve(root.right,res);
    }

    public List<Integer> solve2(TreeNode root,List<Integer> res){
        if(root == null){
            return null;
        }
        solve2(root.left,res);
        res.add(root.val);
        solve2(root.right,res);
        return res;
    }
}

/*
2,3,4,5
*/