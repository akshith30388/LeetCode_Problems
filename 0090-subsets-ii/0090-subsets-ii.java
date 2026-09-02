class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(nums,0,list,ans);
        return ans;
    }
    public void helper(int nums[],int idx,List<Integer> list,List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<Integer>(list));
            return ;
        }
        list.add(nums[idx]);
        helper(nums,idx+1,list,ans);
        list.remove(list.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        helper(nums,idx+1,list,ans);
    }
}