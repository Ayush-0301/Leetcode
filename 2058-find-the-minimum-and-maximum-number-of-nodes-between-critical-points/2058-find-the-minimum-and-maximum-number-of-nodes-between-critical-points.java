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
        int[] ans = {-1,-1};

        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;
        int idx = 1;
        int fidx = -1;
        int lidx = -1;
        int min = Integer.MAX_VALUE;
        if(c== null) return ans;
        while(c!=null)
        {
        //check for critical point

        if((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)){
            if(fidx == -1) fidx = idx;
            if(lidx != -1) {
                int dist = idx-lidx ;
                min = Math.min(dist,min);
            }
            lidx = idx;
        }
        idx++;
        a = a.next;
        b = b.next;
        c = c.next;

        }
        int max = lidx -fidx;
    if(max == 0) max = -1;
    if(min == Integer.MAX_VALUE) min = -1;
    ans[0] = min;
    ans[1] = max;
        return ans;
    }
}