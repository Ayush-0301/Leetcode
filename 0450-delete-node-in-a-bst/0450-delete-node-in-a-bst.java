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
    public TreeNode deleteNode(TreeNode root, int x) {
         // code here
        if(root == null) return null;
        if(root.val > x){ // go left
            root.left = deleteNode(root.left,x);
        }
        else if(root.val < x){
            root.right = deleteNode(root.right,x);
        }
        else { // mil gya 
        //case 1 (leaf node)
          if(root.left == null && root.right == null) return null;
          // caase 2 1 child node
          if(root.left == null) return root.right;
          if(root.right == null) return root.left;
          // case3(2 child nodeu)
          TreeNode pred = root.left;
          while(pred.right != null) pred = pred.right;  
          root.left = deleteNode(root.left,pred.val);
          pred.left = root.left;
          pred.right = root.right;
          return pred;
          
        }
        return root;
    }
}