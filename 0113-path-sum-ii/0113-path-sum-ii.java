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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        List<Integer> list=new ArrayList<>();
        helper(root,targetSum,ans,list);
        return ans;
    }
    public void helper(TreeNode root,int ts,List<List<Integer>> ans,List<Integer> list){
        if(root==null){
            return ;
        }
                list.add(root.val);
        if(root.left==null && root.right==null){
            if(ts-root.val==0){
                ans.add(new ArrayList<Integer>(list));
            }
        }

        helper(root.left,ts-root.val,ans,list);
        helper(root.right,ts-root.val,ans,list);
        list.remove(list.size()-1);
        
    }
}