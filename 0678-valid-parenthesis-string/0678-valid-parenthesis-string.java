class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> star=new Stack<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='('){
                stack.push(i);
            }else if(ch[i]=='*'){
                star.push(i);
            }else {
                if(!stack.isEmpty()){
                    stack.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else{
                    return false;
                }
            }
        }
        while(!stack.isEmpty() && !star.isEmpty()){
            if(stack.peek()<star.peek()){
                stack.pop();
                star.pop();
            }else{
                break;
            }
        }
        return stack.isEmpty();

    }
}