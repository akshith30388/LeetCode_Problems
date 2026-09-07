class Solution {
    public ListNode partition(ListNode head, int x) {
      ListNode ptr=head;
      ListNode dummy1=new ListNode(-1);
      ListNode dummy2=new ListNode(-2);
      ListNode d1=dummy1;
      ListNode d2=dummy2;
      while(ptr!=null){
        if(ptr.val<x){
            d1.next=ptr;
            ptr=ptr.next;
            d1=d1.next;
        }
        else{
            d2.next=ptr;
            ptr=ptr.next;
            d2=d2.next;
        }
      }  
      d1.next=dummy2.next;
      d2.next=null;
      return dummy1.next;
    }
}