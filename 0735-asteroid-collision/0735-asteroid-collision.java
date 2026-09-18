class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                int sum=stack.peek()+asteroids[i];
                if(sum<0){
                    stack.pop();
                }
                else if(sum>0){
                   asteroids[i]=0;
                    break;
                }else if(sum==0){
                   asteroids[i]=0;
                    stack.pop();
                }
            }
            if(asteroids[i]!=0){
                stack.push(asteroids[i]);
            }
            
        }
        int a=stack.size();
        int ans[]=new int[a];
        for(int i=a-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}