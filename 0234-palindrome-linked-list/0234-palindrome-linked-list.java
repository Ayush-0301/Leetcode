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
    public boolean isPalindrome(ListNode head) {
 
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        while(j!= null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
}