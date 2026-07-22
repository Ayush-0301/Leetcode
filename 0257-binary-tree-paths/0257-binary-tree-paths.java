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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }

    private void dfs(TreeNode node, String currentPath, List<String> paths) {
      
        if (node.left == null && node.right == null) {
            paths.add(currentPath + node.val);
            return;
        }

        // Traverse left 
        if (node.left != null) {
            dfs(node.left, currentPath + node.val + "->", paths);
        }

        //  right child
        if (node.right != null) {
            dfs(node.right, currentPath + node.val + "->", paths);
        }
    }
}