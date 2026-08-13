class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,0)+1);
            n/=10;
        }
        int ans=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            ans+=key*freq;
        }
        return ans;
    }
}