class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int n1[] = new int[4];
        int n2[] = new int[4];
        int n3[] = new int[4];
        for (int i = 4 - 1; i >= 0; i--) {
         if (num1 != 0) {
                n1[i] = num1 % 10;
                num1 /= 10;
            }
        }
        for (int i = 4 - 1; i >= 0; i--) {
            if (num2 != 0) {
                n2[i] = num2 % 10;
                num2 /= 10;
            }
        }
        for (int i = 4 - 1; i >= 0; i--) {
            if (num3 != 0) {
                n3[i] = num3 % 10;
                num3 /= 10;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<4;i++){
           str.append(Math.min(Math.min(n1[i],n2[i]),n3[i]));
        }
        int ans=Integer.parseInt(str.toString());
        return ans;
        
    }
}
