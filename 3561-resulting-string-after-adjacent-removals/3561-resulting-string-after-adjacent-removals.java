class Solution {
    public String resultingString(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && isCon(stack.peek(),ch)){
              stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
    public boolean isCon(char a, char b){
        return Math.abs(a-b)==1 ||Math.abs(a-b)==25;
    }
    //a-b ==1 is normal  a-b==25 is like a=97 z=122 both diiff is 25 so 
}

