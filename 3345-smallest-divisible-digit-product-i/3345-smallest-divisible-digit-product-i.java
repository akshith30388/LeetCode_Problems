class Solution {
    public int smallestNumber(int n, int t) {
        int first=n;
        int last=101;
        int ans=0;
    for(int i=first;i<last;i++){
        if(isvalid(i,t)){
          ans=i;
          break;
        }
    }
    return ans;
    }
    public static boolean isvalid(int n,int t){
        int product=1;
        while(n!=0){
            int r=n%10;
            product=product*r;
            if(product%t==0){
                return true;
            }
            n/=10;
        }
        return false;

    }
}