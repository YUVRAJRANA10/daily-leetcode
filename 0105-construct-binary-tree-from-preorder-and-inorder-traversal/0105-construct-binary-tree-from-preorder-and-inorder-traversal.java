/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    static int preIndex;
    static HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         
      preIndex = 0;

     for(int i = 0; i < inorder.length; i++){

        map.put(inorder[i],i);
     }

    return solve(preorder, inorder, 0, inorder.length - 1);

    }


    static TreeNode solve(int preorder[], int inorder[], int start, int last){


        if(start > last){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preIndex++]);

        int idx = map.get(root.val);

    

       root.left = solve(preorder, inorder,start, idx -1 );
       root.right = solve(preorder, inorder,idx +1 , last );


        return root;
    }
}