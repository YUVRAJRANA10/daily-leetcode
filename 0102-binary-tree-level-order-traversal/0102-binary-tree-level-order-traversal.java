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

    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return l;
        }
        level(root);
        return l;

    }



    public void level(TreeNode root){


        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i = 0; i < size; i++){

              TreeNode curr = q.poll();
              if(curr!=null){
              a.add(curr.val);}
              if(curr.left!= null){
                q.add(curr.left);
                }
              if(curr.right!=null) q.add(curr.right);
              
            }
           l.add(a);
        }
    }
}