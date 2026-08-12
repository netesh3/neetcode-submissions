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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        List<List<Integer>> res = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(null);
        List<Integer> temp = new ArrayList();
        while(!queue.isEmpty()){
            TreeNode poll = queue.poll();
            
            if(poll == null){
                continue;
            }
            temp.add(poll.val);

            if(poll.left!=null){
                queue.add(poll.left);
            }
            if(poll.right!=null){
                queue.add(poll.right);
            }
            if(queue.peek() == null){
                queue.poll();
                res.add(temp);
                queue.add(null);
                temp = new ArrayList();
            }
        }
        return res;
    }
}
