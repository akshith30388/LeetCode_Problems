class Solution {
    public int minimumSwaps(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int count=0;
        while(l<r){
            if(nums[l]==0){
                if(nums[r]!=0){
                    int temp=nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                    l++;
                    r--;
                    count++;
                }else{
                    r--;
                }
            }else{
                l++;
            }
        }
        return count;
    }
}