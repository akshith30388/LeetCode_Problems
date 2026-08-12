class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        ArrayList<int[]> ans=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(intervals[i][1],end);
            }else{
               int a[]={start,end};
               ans.add(a);
            start=intervals[i][0];
            end=intervals[i][1];
            }
        }
          int a[]={start,end};
               ans.add(a);
        int l[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            l[i]=ans.get(i);
        }
        return l;
    }
}