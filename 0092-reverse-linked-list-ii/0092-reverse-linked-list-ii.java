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

    public ListNode reverseBetween(ListNode head, int l, int r) {

        if (head == null || l == r)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;

        for (int i = 1; i < l; i++) {
            temp = temp.next;
        }

        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        temp = head2;
        for (int i = 1; i < r - l + 1; i++) {
            temp = temp.next;
        }

        ListNode tail2 = temp;
        ListNode head3 = tail2.next;

        tail1.next = null;
        tail2.next = null;

        ListNode newHead = reverse(head2);

        tail1.next = newHead;
        head2.next = head3;

        return dummy.next;

    }
}