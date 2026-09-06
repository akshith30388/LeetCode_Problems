class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                c++;
            }
        }
        if(k==c){
            return n-c;
        }
        if(k==c-1){
            return c;
        }
        return 0;
    }
}