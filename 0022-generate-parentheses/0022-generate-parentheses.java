class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> valid=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        generate(n,str,valid,0,0);
        return valid;
    }
     static void generate(int n,StringBuilder str ,List<String> valid,int o,int c){
        if(str.length()==n*2){
            valid.add(str.toString());
            return ;
        }
        if(o<n){
        str.append('(');
        generate(n,str,valid,o+1,c);
        str.deleteCharAt(str.length()-1);
        }
        if(o>c){
        str.append(')');
        generate(n,str,valid,o,c+1);
        str.deleteCharAt(str.length()-1);
        }
    }
    // // public static boolean isValid(String s){
    //     Stack<Character> stack=new Stack<>();
    //     for(char ch:s.toCharArray()){
    //         if(ch=='('){
    //             stack.push(ch);
    //         }else{
    //             if(stack.isEmpty()){
    //                 return false;
    //             }
    //            else if(stack.peek()=='('&& ch==')'){
	//               stack.pop();
	//           }
    //         }
    //     }
    //         return stack.isEmpty();
    // }

}