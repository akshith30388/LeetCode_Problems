class Solution {
    public int maximumLengthSubstring(String s) {
    int i=0;
    int n=s.length();
    int j=0;
    int max=0;
    HashMap<Character,Integer> map=new HashMap<>();
    while(j<n){
        map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
       while(map.get(s.charAt(j))>2){
        int freq=map.get(s.charAt(i));
        if(freq>1){
            map.put(s.charAt(i),freq-1);
        }else{
            map.remove(s.charAt(i));
        }
        i++;
       }

    max=Math.max(j-i+1,max);
    
    j++;
    }
    return max;
    }
}