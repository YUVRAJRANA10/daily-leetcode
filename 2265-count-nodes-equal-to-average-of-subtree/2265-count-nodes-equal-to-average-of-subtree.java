class Solution {
    public int averageOfSubtree(TreeNode root) {
        if (root == null) return 0;

        // 1. Calculate sum and count for CURRENT node's subtree
        int sum = getSum(root);
        int count = getCount(root);

        // 2. Check if current node satisfies the condition
        int isMatch = (root.val == sum / count) ? 1 : 0;

        // 3. Recurse down to left and right children and aggregate total matches
        return isMatch + averageOfSubtree(root.left) + averageOfSubtree(root.right);
    }

    private int getSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getSum(node.left) + getSum(node.right);
    }

    private int getCount(TreeNode node) {
        if (node == null) return 0;
        return 1 + getCount(node.left) + getCount(node.right);
    }
}