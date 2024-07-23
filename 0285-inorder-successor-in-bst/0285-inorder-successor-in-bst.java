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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // Inorder is Left - - Root- Right
        // We need to do an Inrder traversal
        //checking via binary search - means breaking the tree
        TreeNode res = null;
        while(root!=null){
            if(p.val>=root.val){
                root = root.right;
            }else{
                res = root;
                root= root.left;
            }
        }
        
        return res;
        
        
        
        
    }
}