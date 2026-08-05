class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        generate(n,str,ans);
        List<String> valid=new ArrayList<>();
        for(String s:ans){
            if(isValid(s)){
                valid.add(s);
            }
        }
        return valid;
    }
     static void generate(int n,StringBuilder str ,List<String> ans){
        if(str.length()==2*n){
            ans.add(str.toString());
            return ;
        }
        str.append('(');
        generate(n,str,ans);
        str.deleteCharAt(str.length()-1);
         str.append(')');
        generate(n,str,ans);
        str.deleteCharAt(str.length()-1);
    }
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
               else if(stack.peek()=='('&& ch==')'){
	              stack.pop();
	          }
            }
        }
            return stack.isEmpty();
    }

    }