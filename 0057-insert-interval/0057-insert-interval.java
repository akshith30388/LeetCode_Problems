class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int []> ans=new ArrayList<>();
    int n=intervals.length;
    int idx=0;
    while(idx<n && intervals[idx][1]<newInterval[0]){
        ans.add(intervals[idx]);
        idx++;
    }
    int min = newInterval[0];
    int max = newInterval[1];
    while(idx<n && intervals[idx][0]<=newInterval[1]){
         min=Math.min(intervals[idx][0],min);
         max=Math.max(intervals[idx][1],max);
         idx++;
    }
    ans.add(new int[]{min,max});

    while(idx<n){
        ans.add(intervals[idx]);
        idx++;
    }
    return ans.toArray(new int[ans.size()][]);
    }
}



// [1,2]
// ,[3,5]
// ,[6,7]
// ,[8,10]
// ,[12,16]

// 4,8