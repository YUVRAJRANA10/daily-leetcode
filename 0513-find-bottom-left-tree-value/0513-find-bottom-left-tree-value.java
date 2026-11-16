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
    public int findBottomLeftValue(TreeNode root) {
        
     List<Integer> l = new ArrayList<>();
        dfs(root,0,l);
        return l.get(l.size()-1);
     }

     public void dfs(TreeNode root,int depth,List<Integer> l){
        if(root == null)return;
        
        if(depth == l.size())l.add(root.val);

        dfs(root.left,depth+1,l);
        dfs(root.right,depth+1,l);
         }
}