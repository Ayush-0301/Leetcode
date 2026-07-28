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
    static int sum;
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        rev(root);
        return root;
    }
    public static void rev(TreeNode root){
        if(root == null) return;
        rev(root.right);
        int val = root.val;
       
        sum += val;
         root.val = sum;
        rev(root.left);

    }

}