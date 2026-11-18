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
    public void dfs(TreeNode root, List<List<Integer>> ans, int targetSum, List<Integer> curr) {
        if (root == null)
            return;
        curr.add(root.val);

        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                ans.add(new ArrayList<>(curr));
            }
            curr.remove(curr.size() - 1);
            return;
        }

        int remainingSum = targetSum - root.val;
        dfs(root.left, ans, remainingSum, curr);
        dfs(root.right, ans, remainingSum, curr);
        curr.remove(curr.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, targetSum, new ArrayList<>());
        return ans;
    }
}