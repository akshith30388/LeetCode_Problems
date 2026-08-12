class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       int i=0;
       int j=0;
       int max=0;
       int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k){
                int freq=map.get(nums[i]);
                if(freq>1) {
                    map.put(nums[i],freq-1);
                    }
                else{
                     map.remove(nums[i]);
                     }
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}