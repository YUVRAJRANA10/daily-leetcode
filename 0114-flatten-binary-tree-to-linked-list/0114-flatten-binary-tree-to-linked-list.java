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
    public void flatten(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {
                // Find the rightmost node in the left subtree
                TreeNode prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }

                // Connect the original right subtree to the end of the left subtree
                prev.right = curr.right;

                // Move left subtree to the right and clear left pointer
                curr.right = curr.left;
                curr.left = null;
            }

            // Move to the next node in the flattened list
            curr = curr.right;
        }
    }
}