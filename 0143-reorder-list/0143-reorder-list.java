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
    public ListNode reverse(ListNode head) {

        if (head == null)
            return null;
        ListNode p = null;//previous
        ListNode f = null;//forward
        ListNode c = head;//current
        while (c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;

        }
        return p;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
    return;
}
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode a = head;
        ListNode b = head2;

       
        

        while(b != null){
        ListNode c = a.next;
        ListNode d = b.next;

            a.next = b;
            b.next= c;
            
            a = c;
            b = d;
            
           
           
           
        }
   
    }
}