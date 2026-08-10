class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String elements[]=new String[n];
        for(int i=0;i<n;i++){
            elements[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(elements,(a,b)->{
            String first=a+b;
            String sec=b+a;
            return sec.compareTo(first);//bez we need first incresing to decreasing
        });
        if(elements[0].equals("0")) return "0";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            str.append(elements[i]);
        }
        return str.toString();
    }
}
