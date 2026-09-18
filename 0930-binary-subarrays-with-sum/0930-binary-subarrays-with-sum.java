class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public static  int  atmost(int nums[],int goal){
        int j=0;
        int i=0;
        int n=nums.length;
        int count=0;
        int sum=0;
        if(goal<0){
            return 0;
        }
        while(j<n){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}