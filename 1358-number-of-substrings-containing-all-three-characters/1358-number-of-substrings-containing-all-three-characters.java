class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int i=0;
        int j=0;
        int n=s.length();
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.size()==3){
                count+=n-j;
                char ch=s.charAt(i);
                
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
              map.put(ch,map.get(ch)-1);
                }
                i++;
            }
            j++;
        }
        return count;
    }
}