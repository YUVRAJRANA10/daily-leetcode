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
    public ListNode rotateRight(ListNode head, int k) {
       
        if (k == 0)
            return head;
        if (head == null || head.next == null)
            return head;

        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        k = k % n;
        if (k == 0)
            return head;
            
        int i = 1;
        temp = head;
        while (i < (n - k)) {
            temp = temp.next;
            i++;
        }
        ListNode dummy = new ListNode(0);
        ListNode newhead = dummy;
        newhead.next = temp.next;
        newhead = newhead.next;

        temp.next = null;

        while (newhead.next != null) {
            newhead = newhead.next;
        }
        newhead.next = head;

        return dummy.next;

    }
}