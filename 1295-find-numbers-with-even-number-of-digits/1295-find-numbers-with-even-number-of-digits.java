class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++){
        int digits=fun(nums[i]);
        if(digits%2==0){
            count++;
        }
       }
       return count; 
    }
    public static int fun(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
}