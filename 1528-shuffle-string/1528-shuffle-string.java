class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder();
        TreeMap<Integer,Character> map=new TreeMap<>();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        for(char ch:map.values()){
            str.append(ch);
        }
        return str.toString();
    }
}