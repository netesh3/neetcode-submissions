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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ser(root,sb);
        return sb.toString();
    }

    public void ser(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        ser(root.left,sb);
        ser(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")){
            return null;
        }
        Queue<String> queue = new LinkedList(Arrays.asList(data.split(",")));
        return der(queue);
    }

    public TreeNode der(Queue<String> queue){
        String poll = queue.poll();
        if(poll.equals("#")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(poll));
        root.left = der(queue);
        root.right = der(queue);
        return root;
    }
}
