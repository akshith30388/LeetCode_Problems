class Solution {
    public String reverseWords(String s) {
       String a[]=s.trim().split("\\s+");
       StringBuilder str=new StringBuilder();
       for(int i=a.length-1;i>=0;i--){
        str.append(a[i]).append(" ");
       } 
       return str.toString().trim();

    }
}