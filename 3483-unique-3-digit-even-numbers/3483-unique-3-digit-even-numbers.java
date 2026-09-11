class Solution {
    public int totalNumbers(int[] digits) {
        boolean seen[]=new boolean[1000];
        int n=digits.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||i==k||j==k){
                        continue;
                    }
                    if(digits[i]==0 || digits[k]%2!=0){
                        continue;
                    }
                    int total=digits[i]*100 + digits[j]*10 +digits[k];
                    if(!seen[total]){
                        count++;
                        seen[total]=true;
                    }
                }
            }
        }
        return count;
    }
}