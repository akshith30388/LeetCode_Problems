class Solution {
    public int missingMultiple(int[] nums, int k) {
      Set<Integer>  elements=new HashSet<>();
    int n=nums.length;
    for(int val:nums){
        elements.add(val);
    }
    int missing=0;
    for(int i=1;i<=n;i++){
        int num=k*i;
        if(!elements.contains(num)){
           return num;
        }
    }
    return k*(n+1);
    }
}