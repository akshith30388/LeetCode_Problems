class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        generate(nums,0,ans,list);
        int xor=0;
        for(List<Integer> s:ans){
            if(s.size()>0){
            int q=s.get(0);
            for(int i=1;i<s.size();i++){
                q^=s.get(i);
            }
             xor+=q;
            }
           
        }
        return xor;

    }
    public void generate(int nums[],int idx,List<List<Integer>> ans, List<Integer> list){
        if(idx==nums.length){
            ans.add(new ArrayList<Integer>(list));
            return ;
        }
        list.add(nums[idx]);
        generate(nums,idx+1,ans,list);
        list.remove(list.size()-1);
        generate(nums,idx+1,ans,list);
    }
}