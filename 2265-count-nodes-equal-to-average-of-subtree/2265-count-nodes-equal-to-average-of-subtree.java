class Solution {
    static int ans=0;
    public int averageOfSubtree(TreeNode root) {
        ans=0;
        if(root==null){
            return 0;
        }

        helper(root);
        return ans;
    }
    public void helper(TreeNode root){
        if(root==null){
            return ;
        }
        helper(root.left);
        helper(root.right);
        int sum=sum(root);
        int count=c(root);
        int avg=sum/count;
        if(root.val==avg){
            ans++;
        }

    }
    public int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
    public int c(TreeNode root){
        if(root==null){
            return 0;
        }
      
        return 1+c(root.left)+c(root.right);
        
    }
} 
