class Solution {
    public int differenceOfSum(int[] nums) {
        return Math.abs( sum(0,nums)-digit(0,nums));
    }
    public static int sum(int sum,int nums[]){
        for(int val:nums){
            sum+=val;
        }
        return sum;
    }
    public static int digit(int di,int nums[]){
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                di+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return di;
    }
    

}