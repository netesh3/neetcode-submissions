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


/*
[4,2,5,1,3]

[4,2,5]
*/


class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null && subRoot == null){
            return true;
        }

        if(root == null || subRoot == null){
            return false;
        }
        
        if(checkiFSame(root,subRoot)){
            return true;
        }
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public boolean isExists(TreeNode root, TreeNode subRoot){
        
        if(root == null && subRoot == null){
            return true;
        }

        if(root == null || subRoot == null){
            return false;
        }

        if(root.val == subRoot.val){
            return checkiFSame(root,subRoot);
        }

        return isExists(root.left,subRoot) || isExists(root.right,subRoot);
    }

    public boolean checkiFSame(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }

        if(root.val !=subRoot.val){
            return false;
        }
        return checkiFSame(root.left,subRoot.left) && checkiFSame(root.right,subRoot.right);
    }
}






// class Solution {  
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(root==null){
//             return false;
//         }
//         if(isSame(root,subRoot)){
//             return true;
//         }
//         return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
//     }

//     public boolean isSame(TreeNode p, TreeNode q){
//         if(p==null && q==null){
//             return true;
//         }
//         if(p!=null && q==null){
//             return false;
//         }
//         if(p==null && q!=null){
//             return false;
//         }
//         if(p.val!=q.val){
//             return false;
//         }
//         return isSame(p.left,q.left)&& isSame(p.right,q.right);
//     }
// }
