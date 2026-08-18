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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        solve(ans,root,"");
        return ans;
    }
    private static void solve(List<String> ans,TreeNode root,String s){
        if(root==null){
           return ;
        }
         s=s+root.val;
        if(root.left==null && root.right==null){
            ans.add(s);
            return ;
        }
       s=s+"->";
        if(root.left!=null){
        solve(ans,root.left,s);
        }
        
        if(root.right!=null){
        solve(ans,root.right,s);
        }
       
    }
}