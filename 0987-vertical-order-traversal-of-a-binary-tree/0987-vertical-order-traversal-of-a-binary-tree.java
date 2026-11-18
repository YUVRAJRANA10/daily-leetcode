class Solution {
    // Helper class to keep track of row and value together
    class NodeInfo {
        int row;
        int val;
        NodeInfo(int row, int val) {
            this.row = row;
            this.val = val;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        // Map column -> list of NodeInfo (row, val)
        Map<Integer, List<NodeInfo>> map = new TreeMap<>();
        
        // Queue for BFS storing [node, col, row]
        // You can create a small helper class for the queue pair as well
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0)); // node, col, row

        while (!q.isEmpty()) {
            Pair currPair = q.poll();
            TreeNode curr = currPair.node;
            int hd = currPair.hd; // column
            int row = currPair.row;

            map.computeIfAbsent(hd, k -> new ArrayList<>()).add(new NodeInfo(row, curr.val));

            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1, row + 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1, row + 1));
            }
        }

        // Sort each column by row first, then by value
        for (int x : map.keySet()) {
            List<NodeInfo> nodes = map.get(x);
            Collections.sort(nodes, (a, b) -> {
                if (a.row != b.row) {
                    return Integer.compare(a.row, b.row); // Sort top-to-bottom
                }
                return Integer.compare(a.val, b.val); // Sort by value if same row
            });

            // Extract just the values into the final result list
            List<Integer> colValues = new ArrayList<>();
            for (NodeInfo node : nodes) {
                colValues.add(node.val);
            }
            list.add(colValues);
        }

        return list;
    }
}

// Helper class for BFS queue
class Pair {
    TreeNode node;
    int hd;
    int row;
    Pair(TreeNode node, int hd, int row) {
        this.node = node;
        this.hd = hd;
        this.row = row;
    }
}