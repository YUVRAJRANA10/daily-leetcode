class Solution {
    private int matchingCount = 0;

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return matchingCount;
    }

    // Returns an array of size 2: [sum of subtree, count of nodes in subtree]
    private int[] postOrder(TreeNode node) {
        if (node == null) {
            return new int[] { 0, 0 };
        }

        // 1. Traverse left and right subtrees first (Bottom-Up)
        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);

        // 2. Compute current subtree's sum and count using children's data
        int currentSum = node.val + left[0] + right[0];
        int currentCount = 1 + left[1] + right[1];

        // 3. Check if the average equals the node's value
        if (node.val == currentSum / currentCount) {
            matchingCount++;
        }

        // 4. Pass the calculated sum and count up to the parent
        return new int[] { currentSum, currentCount };
    }
}