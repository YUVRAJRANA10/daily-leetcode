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
    public void dfs(String path, TreeNode root, List<String> lt) {
        if (root == null)
            return;
        path+=root.val;

        if (root.left == null && root.right == null) {
            lt.add(path);
            return;
        }
        path+="->";
        dfs(path, root.left, lt);
        dfs(path, root.right, lt);

    }

    public List<String> binaryTreePaths(TreeNode root) {

        String sb = "";
        List<String> lt = new ArrayList<>();

        dfs(sb, root, lt);
        return lt;
    }
}