class Solution {
    // Simple custom helper class to hold the node and its index
    private static class NodeInfo {
        TreeNode node;
        int index;
        NodeInfo(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 0;
        
        Queue<NodeInfo> q = new LinkedList<>();
        q.offer(new NodeInfo(root, 0));
        
        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().index; // Normalize to prevent integer overflow
            int first = 0, last = 0;
            
            for (int i = 0; i < size; i++) {
                NodeInfo curr = q.poll();
                int normalizedIndex = curr.index - minIndex;
                
                if (i == 0) first = normalizedIndex;
                if (i == size - 1) last = normalizedIndex;
                
                if (curr.node.left != null) {
                    q.offer(new NodeInfo(curr.node.left, 2 * normalizedIndex + 1));
                }
                if (curr.node.right != null) {
                    q.offer(new NodeInfo(curr.node.right, 2 * normalizedIndex + 2));
                }
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
        }
        return maxWidth;
    }
}