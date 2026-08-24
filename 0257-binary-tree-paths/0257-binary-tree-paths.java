class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
    public void helper(TreeNode root,List<String> ans,String s){
        if(root==null){
            return ;
        }
        if(s.length()==0){
            s=s+root.val;
        }else{
            s=s+"->"+root.val;
        }
        if(root.left==null && root.right==null){
            ans.add(s);
        }
        helper(root.left,ans,s);
        helper(root.right,ans,s);
    }
}