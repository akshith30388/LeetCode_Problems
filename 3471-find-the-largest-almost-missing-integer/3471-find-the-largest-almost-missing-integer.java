class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-k+1;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int val:set){
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        int max=-1;
        for(int val:map.keySet()){
            if(map.get(val)==1){
                max=Math.max(val,max);
            }
        }   
        return max;
    }
}