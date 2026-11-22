import java.util.*;

class Solution {
    static class NodeInfo {
        TreeNode node;
        long index;

        NodeInfo(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxWidth = 0;
        Queue<NodeInfo> queue = new LinkedList<>();
        queue.offer(new NodeInfo(root, 0L));

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long minIndex = queue.peek().index;
            long first = 0;
            long last = 0;

            for (int i = 0; i < levelSize; i++) {
                NodeInfo curr = queue.poll();
                long normalizedIndex = curr.index - minIndex;

                if (i == 0) {
                    first = normalizedIndex;
                }
                if (i == levelSize - 1) {
                    last = normalizedIndex;
                }

                if (curr.node.left != null) {
                    queue.offer(new NodeInfo(curr.node.left, 2 * normalizedIndex + 1));
                }
                if (curr.node.right != null) {
                    queue.offer(new NodeInfo(curr.node.right, 2 * normalizedIndex + 2));
                }
            }

            int currentWidth = (int) (last - first + 1);
            maxWidth = Math.max(maxWidth, currentWidth);
        }

        return maxWidth;
    }
}