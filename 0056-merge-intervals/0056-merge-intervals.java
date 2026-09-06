class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
    });
    List<int[]> ans=new ArrayList<>();
    int s=intervals[0][0];
    int e=intervals[0][1];
    for(int i=1;i<n;i++){
        if(intervals[i][0]<=e){
            e=Math.max(e,intervals[i][1]);
        }else{
            ans.add(new int[]{s,e});
           s=intervals[i][0];
           e=intervals[i][1];
        }
    }
    ans.add(new int[]{s,e});
    return ans.toArray(new int[ans.size()][]);
    }
}
