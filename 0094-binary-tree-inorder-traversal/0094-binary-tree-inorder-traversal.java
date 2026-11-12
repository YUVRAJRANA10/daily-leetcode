class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        while (current != null || !stack.isEmpty()) {
            // Reach the left-most node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Current must be null at this point, so pop from stack
            current = stack.pop();
            result.add(current.val); // Add root/value
            
            // We have visited the node and its left subtree; now shift to right subtree
            current = current.right;
        }
        
        return result;
    }
}