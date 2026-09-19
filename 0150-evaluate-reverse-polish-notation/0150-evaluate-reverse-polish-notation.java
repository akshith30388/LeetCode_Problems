class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack=new Stack<>();
       for(String ch:tokens){
        if(ch.equals("+")){
           int  y=stack.pop();
            int  x=stack.pop();
            stack.push(x+y);
        }else   if(ch.equals("-")){
             int  y=stack.pop();
            int  x=stack.pop();
            stack.push(x-y);
        }else  if(ch.equals("*")){
               int  y=stack.pop();
            int  x=stack.pop();
            stack.push(x*y);
        }else  if(ch.equals("/")){
            int  y=stack.pop();
            int  x=stack.pop();
            stack.push(x/y);
        }else{
            stack.push(Integer.parseInt(ch));
        }
       }
       return stack.peek();
    }
}