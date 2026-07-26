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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  arr = new ArrayList<>();
        
        dfs(root,arr,ans,sum);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> arr, List<List<Integer>> ans, int sum) {
        if (root == null) return;
        arr.add(root.val);
        if(root.left == null && root.right == null && sum == root.val){
            ans.add(new ArrayList<>(arr));
        }
        if(root.left != null) dfs(root.left,arr,ans,sum-root.val);
        if(root.right != null) dfs(root.right,arr,ans,sum-root.val);
        arr.remove(arr.size()-1);
    }
}