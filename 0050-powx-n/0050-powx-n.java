class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            return 1.0/ans(x,-(long)n);
        }
        return ans(x,n);
    }
    public static double ans(double x, long n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return ans(x*x,n/2);
        }
        else{
            return x*ans(x*x,(n-1)/2);
        }
    }
}