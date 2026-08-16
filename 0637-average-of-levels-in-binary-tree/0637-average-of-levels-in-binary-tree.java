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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode top=queue.poll();
                sum+=top.val;
                if(top.left!=null)queue.offer(top.left);
                if(top.right!=null)queue.offer(top.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}