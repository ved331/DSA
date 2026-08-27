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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        levelOrderAns(root , ans);
        return ans;
    }
    public static void levelOrderAns(TreeNode root , List<List<Integer>> ans){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> level=new ArrayList<>();
        while(!q.isEmpty()){
        TreeNode currNode=q.remove();
        if(currNode==null){

           // Current level is complete
           ans.add(level);               //System.out.println();   

           // Create list for next level
         level=new ArrayList<>();

            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
             // Add current node to current level
            level.add(currNode.val);
            
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
        }
    }
}