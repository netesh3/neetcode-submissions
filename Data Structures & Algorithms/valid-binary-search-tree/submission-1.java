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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null){
            return true;
        }
        list = solve(root,list);
        System.out.println(List.of(list));
        return isStrictlySorted(list);
    }
    public static boolean isStrictlySorted(List<Integer> list) {
        if (list == null || list.size() <= 1) return true;

        for (int i = 0; i < list.size() - 1; i++) {
            // Change to "<" if you want to allow duplicates (2, 2, 2 = true)
            // Use "<=" to ensure it is strictly increasing (2, 2, 2 = false)
            if (list.get(i + 1) <= list.get(i)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> solve(TreeNode root,List<Integer> list){
        if(root!=null){
            solve(root.left,list);
            list.add(root.val);
            solve(root.right,list);
        }   
        return list;
    }
}
