class Solution {
    public int[] rearrangeArray(int[] nums) {
      int n=nums.length;
      int po[]=new int[n/2];
      int ne[]=new int[n/2];
      int e=0;
      int o=0;
      for(int i=0;i<n;i++){
        if(nums[i]<0){
            ne[o++]=nums[i];
        }else{
            po[e++]=nums[i];
        }
      }
      e=0;
      o=0;
      int idx=0;
      for(int i=0;i<n/2;i++){
        nums[idx++]=po[e++];
        nums[idx++]=ne[o++];
      }
      return nums;

    }
}