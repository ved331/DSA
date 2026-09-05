/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
             return root;
        }
        TreeNode leftlca=lowestCommonAncestor(root.left,p,q);
        TreeNode rightlca=lowestCommonAncestor(root.right,p,q);

        if(rightlca==null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
}

// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode> path1=new ArrayList<>();
//         ArrayList<TreeNode> path2=new ArrayList<>();

//         getPath(root,p,path1);
//         getPath(root,q,path2);

//         //lca
//         int i=0;
//         while(i<path1.size() && i<path2.size()){
//             if(path1.get(i)!=path2.get(i)){
//                 break;
//             }
//             i++;
//         }
//         TreeNode lca=path1.get(i-1);
//         return lca;
//     }
//         //getPath for lca
//         public static boolean getPath(TreeNode root,TreeNode n,ArrayList<TreeNode> path){
//            if(root==null){
//             return false;
//            }
//            path.add(root);
//            if(root==n){
//             return true;
//            }
//            boolean foundLeft=getPath(root.left,n,path);
//            boolean foundRight=getPath(root.right,n,path);

//            if(foundLeft || foundRight){
//             return true;
//            }
//            path.remove(path.size()-1);
//            return false;
//         }
//     }
