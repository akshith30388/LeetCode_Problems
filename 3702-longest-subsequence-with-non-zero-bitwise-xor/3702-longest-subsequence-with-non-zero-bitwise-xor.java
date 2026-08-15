class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int zero=0;
        int xor=0;
        for(int num:nums){
            if(num==0){
                zero++;
            }
            xor^=num;
        }
        if(xor==0 && zero!=n){
            return n-1;
        }else if(xor!=0){
            return n;
        }
        return 0;
        //case 1:xor==0 and zero!=nums.length then n-1 return 
        //case 2:xor!=0 then n return all are valid
        //special case if x==0 && zero==nums.length return 0;

    }
}