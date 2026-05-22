class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode root) {

        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        // if already unbalanced
        if(left == -1 || right == -1) return -1;

        // current node unbalanced
        if(Math.abs(left - right) > 1) return -1;

        // return height
        return Math.max(left, right) + 1;
    }
}