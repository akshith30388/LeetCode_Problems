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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-200);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode ptr = head;
        while (ptr != null){
            if (ptr.next != null && ptr.val == ptr.next.val) {
                while (ptr.next != null && ptr.val == ptr.next.val) {
                    ptr = ptr.next;
                }
                prev.next = ptr.next;
                ptr = ptr.next;
            } else {
                prev = ptr;
                ptr = ptr.next;
            }
        }
        return dummy.next;
    }
}