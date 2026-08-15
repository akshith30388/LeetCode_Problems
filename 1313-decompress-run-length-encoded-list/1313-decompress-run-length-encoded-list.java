class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<nums.length;i+=2){
            int val=nums[i];
            int freq=nums[i-1];
            for(int j=1;j<=freq;j++){
                ans.add(val);
            }
        }   
        int v[]=new int[ans.size()];
        int idx=0;
        for(int val:ans){
            v[idx++]=val;
        }
        return v;
    }
}