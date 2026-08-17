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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> ans=new ArrayList<>();
       if(root==null)return ans;
       Stack<TreeNode> stack=new Stack<>();
       TreeNode ptr=root;
       while(!stack.isEmpty()|| ptr!=null){
        while(ptr!=null){
            stack.push(ptr);
            ptr=ptr.left;
        }
        ptr=stack.pop();
        ans.add(ptr.val);
        ptr=ptr.right;
       }
       return ans;
    }
}