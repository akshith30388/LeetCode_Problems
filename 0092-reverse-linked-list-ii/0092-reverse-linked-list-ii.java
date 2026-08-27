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
    public  int len(ListNode head){
        int count=0;
        ListNode ptr=head;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n=len(head);
        ListNode ptr=head;
        Stack<Integer> stack=new Stack<>();
        for(int i=1;i<=left-1;i++){
            ptr=ptr.next;
        }
        for(int i=left;i<=right;i++){
            stack.push(ptr.val);
            ptr=ptr.next;
        }
    ptr=head;
        for(int i=1;i<=left-1;i++){
            ptr=ptr.next;
        }
        for(int i=left;i<=right;i++){
            ptr.val=stack.pop();
            ptr=ptr.next;
        }
       return head;
    }
}