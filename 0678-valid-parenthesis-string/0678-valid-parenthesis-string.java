class Solution {
    public boolean checkValidString(String s) {
        char ch[]=s.toCharArray();
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]=='('|| ch[i]=='*'){
                open++;
            }else if(ch[i]==')'){
                open--;
            }
            if(open<0) return false;
            }
        for(int i=s.length()-1;i>=0;i--){
            if(ch[i]==')'|| ch[i]=='*'){
                close++;
            }else if(ch[i]=='('){
                close--;
            }
            if(close<0){
                return false;
            }
        }
        return true;
    }
}