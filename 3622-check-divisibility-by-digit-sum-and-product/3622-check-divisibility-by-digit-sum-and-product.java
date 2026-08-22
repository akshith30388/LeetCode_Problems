class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int o=n;
        while(n!=0){
            int r=n%10;
            sum+=r;
            product*=r;
            n/=10;
        }
        
        sum+=product;
        return o%sum==0;
    }
}