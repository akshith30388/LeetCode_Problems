class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < nums.length; i += 2) {
            int key = nums[i];
            int freq = nums[i - 1];
            for (int j = 1; j <= freq; j++) {
                ans.add(key);
            }
        }
        int a[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            a[i] = ans.get(i);
        }
        return a;
    }
}