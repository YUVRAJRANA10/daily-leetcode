class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        
        int sum = 0;
        
        // Check if the left child exists and is a leaf node
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        
        // Recurse for the right child as well
        sum += sumOfLeftLeaves(root.right);
        
        return sum;
    }
}