class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int rsum = 0;
        int lsum = 0;
        int rq = 0;
        int lq = 0;
        char ch[] = num.toCharArray();
        for (int i = 0; i < n; i++) {
            char ele = ch[i];
            if (i < n / 2) {
                if (ele == '?') {
                    lq++;
                } else {
                    lsum += ele - '0';
                }
            } else {
                if (ele == '?') {
                    rq++;
                } else {
                    rsum += ele - '0';
                }
            }
        }

        if ((lq + rq) % 2 != 0) {
            return true;
        }

      
        return 2 * (lsum - rsum) != 9 * (rq - lq);
    }
}