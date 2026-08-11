class Solution {
    public String minRemoveToMakeValid(String s) {
        ArrayList<Integer> remove=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    remove.add(i);
                }else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            remove.add(stack.pop());
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!remove.contains(i)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}