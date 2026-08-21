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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode rl,TreeNode rr){
        if(rl==null && rr==null){
            return true;
        } 
        if(rl==null || rr==null){
            return false;
        }
        if(rl.val!=rr.val){
            return false;
        }
        return helper(rl.left,rr.right) && helper(rl.right,rr.left);
    }
}