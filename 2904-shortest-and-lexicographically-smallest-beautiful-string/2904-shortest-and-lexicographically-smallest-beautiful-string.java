class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
     int i=0;
     int j=0;
     int n=s.length();
     int count=0;
     List<String> list=new ArrayList<>();
     while(j<n){
        if(s.charAt(j)=='1'){
            count++;
        }
        while(count>k){
            if(s.charAt(i)=='1'){
                count--;
            }
            i++;
        }
        if(count==k){
            list.add(s.substring(i,j+1));
            while(i<=j && s.charAt(i)=='0'){
                i++;
            list.add(s.substring(i,j+1));
            }
        }
        j++;
     }
     if(!list.isEmpty()){
     Collections.sort(list,(a,b)->{
        if(a.length()!=b.length()){
            return a.length()-b.length();
        }
        return a.compareTo(b);
     });
     return list.get(0);
     }
     return "";
    }
}