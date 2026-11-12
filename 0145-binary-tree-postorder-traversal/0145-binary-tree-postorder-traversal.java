class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val); // Builds Root -> Right -> Left order
            
            // Push left first so right is processed first
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        
        // Reverse Root -> Right -> Left to get Left -> Right -> Root (Postorder)
        Collections.reverse(result);
        return result;
    }
}