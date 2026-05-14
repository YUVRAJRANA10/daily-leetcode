class Solution {

    int postIndex;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        // store inorder indexes
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return solve(inorder, postorder,
                     0, inorder.length - 1);
    }

    TreeNode solve(int[] inorder, int[] postorder,
                   int inStart, int inEnd) {

        // base case
        if(inStart > inEnd) {
            return null;
        }

        // current root
        int val = postorder[postIndex--];

        TreeNode root = new TreeNode(val);

        // find root in inorder
        int idx = map.get(val);

        // IMPORTANT
        // build right subtree first
        root.right = solve(inorder, postorder,
                           idx + 1, inEnd);

        // then left subtree
        root.left = solve(inorder, postorder,
                          inStart, idx - 1);

        return root;
    }
}