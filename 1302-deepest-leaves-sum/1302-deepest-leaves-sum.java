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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        if(root.left==null && root.right==null){
            return root.val;
        }
        int ans=0;
        while(!q.isEmpty()){
                int size=q.size();
                int sum=0;
                for(int i=0;i<size;i++){
                    TreeNode top=q.poll();
                    if(top.left!=null){
                        sum+=top.left.val;
                        q.offer(top.left);
                    }
                    if(top.right!=null){
                        sum+=top.right.val;
                        q.offer(top.right);
                    }
                   if(sum!=0){
                    ans=sum;
                   }
                }
        }
        return ans;

    }
}