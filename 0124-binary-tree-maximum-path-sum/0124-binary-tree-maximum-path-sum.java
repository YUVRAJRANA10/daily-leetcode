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
    int ans = Integer.MIN_VALUE;
    public int f(TreeNode root){
        if(root == null)return 0;
        
        int l  = f(root.left);
        int r = f(root.right);

        int temp = Math.max(Math.max(l,r)+root.val,root.val);
        int temp2 = Math.max(temp,l+r+root.val);
        ans = Math.max(temp2,ans);

        return temp;
    }
    public int maxPathSum(TreeNode root) {
         f(root);
         return ans;
    }
}