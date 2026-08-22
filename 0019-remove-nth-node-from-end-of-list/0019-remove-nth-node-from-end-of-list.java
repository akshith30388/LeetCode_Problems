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
    public int length(ListNode head){
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=length(head);
        int idx=len-n;
        ListNode ptr=head;
        if(idx==0){
            return head.next;
        }else{
        
    for(int i=0;i<len-n-1;i++){
        ptr=ptr.next;
    }
    ptr.next=ptr.next.next;
    ptr=head;
        }
    return ptr;
    }
}