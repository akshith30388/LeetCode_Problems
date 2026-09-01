/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[]={-1, -1};
        if(head==null || head.next==null || head.next.next==null) return ans;
        List<Integer> list=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null){
            list.add(ptr.val);
            ptr=ptr.next;
        }
        List<Integer> possible=new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if((list.get(i)>list.get(i+1) && list.get(i)>list.get(i-1))||  (list.get(i)<list.get(i+1) && list.get(i)<list.get(i-1))) {
                possible.add(i);
            }
        }
         if (possible.size() < 2)
            return ans;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < possible.size(); i++) {
            min = Math.min(
                min,
                possible.get(i) - possible.get(i - 1)
            );
        }

        int max = possible.get(possible.size() - 1)- possible.get(0);

        ans[0] = min;
        ans[1] = max;

        return ans;  

    }
}