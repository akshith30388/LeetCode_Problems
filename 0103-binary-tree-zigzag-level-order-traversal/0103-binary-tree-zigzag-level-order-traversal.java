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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        int flag=0;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode top=q.poll();
                list.add(top.val);
                if(top.left!=null)q.offer(top.left);
                if(top.right!=null)q.offer(top.right);
            }
            if(flag%2!=0){//odd index
            Collections.reverse(list);
            }
            ans.add(list);
            flag++;
        }
        return ans;
    }
}