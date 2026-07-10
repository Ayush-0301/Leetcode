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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        for(int i = 0 ;i<arr.size()-1;i = i+2){
            ListNode t = arr.get(i);
          arr.set(i, arr.get(i + 1));
            arr.set(i + 1, t);
        }
        for(int i = 0;i<arr.size()-1;i++){
            arr.get(i).next = arr.get(i+1);
        }

        arr.get(arr.size()-1).next = null;
        return arr.get(0);
    }
}