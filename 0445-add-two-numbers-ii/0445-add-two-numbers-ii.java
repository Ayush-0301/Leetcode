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
        ListNode f = null;
        ListNode p = null;
        ListNode c = head;
        while (c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = reverse(l1);
        ListNode n2 = reverse(l2);
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (n1 != null || n2 != null || carry != 0) {
            int sum = carry;
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
             if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            carry = sum/10;
            int digit = sum %10;
            tail.next = new ListNode(digit);
            tail = tail.next;

        }
        return reverse(dummy.next);

    }

}