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
    public static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a!=0){
            return a;
        }
        return b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
       ListNode node1=head;
       ListNode node2=head.next;
       while(node2!=null){
        ListNode n=new ListNode(gcd(node1.val,node2.val));
        node1.next=n;
        n.next=node2;
        node1=node2;
        node2=node2.next;
       }
       return head;
    }
}