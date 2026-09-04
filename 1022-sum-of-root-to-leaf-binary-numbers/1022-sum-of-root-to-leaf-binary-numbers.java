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
    public int sumRootToLeaf(TreeNode root) {
        List<String> ans=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        helper(root,ans,str);
        int sum=0;
        for(String s:ans){
            sum+=Integer.parseInt(s,2);
        }
        return sum;
       
    }
    public void helper(TreeNode root,List<String> ans,StringBuilder str){
        if (root == null) {
        return;
        }
         str.append(root.val);
       if(root.left == null && root.right == null){
        ans.add(str.toString());
         str.deleteCharAt(str.length() - 1);
        return;
        }
       
        helper(root.left,ans,str);
        helper(root.right,ans,str);
        str.deleteCharAt(str.length()-1);

    }
}