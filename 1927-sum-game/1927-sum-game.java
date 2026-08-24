class Solution {
    public boolean sumGame(String num) {
        int ls=0;
        int lq=0;
        int rs=0;
        int rq=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            if(i<n/2){
                if(num.charAt(i)=='?'){
                    lq++;
                }else{
                    int number=num.charAt(i)-'0';
                    ls+=number;
                }
            }else{
                 if(num.charAt(i)=='?'){
                  rq++;
                }else{
                    int number=num.charAt(i)-'0';
                    rs+=number;
                }
            }
        }
        if((lq+rq)%2!=0){
            return true;
        }
        return 2*ls+9*lq!=2*rs+9*rq;
    }
}