class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(int val:bills){
            if(val==5){
                five++;
            }else if(val==10){
                if(five==0){
                    return false;
                }else{
                    five--;
                    ten++;
                }
            }else if(val==20){
                //10+5
                if(ten>=1 && five >=1){
                    twenty++;
                    ten--;
                    five--;
                }else if(five>=3){
                    //5+5+5
                    five-=3;
                    twenty++;
                }else{
                    return false;
                }
            }
        }
     return true;
    }
}