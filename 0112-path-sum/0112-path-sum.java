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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
       return helper(root,targetSum);
    }
    public boolean helper(TreeNode root,int ts){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return ts==root.val;
        }
    boolean l=helper(root.left,ts-root.val);
    boolean r=helper(root.right,ts-root.val);
    return l||r;
    }
}