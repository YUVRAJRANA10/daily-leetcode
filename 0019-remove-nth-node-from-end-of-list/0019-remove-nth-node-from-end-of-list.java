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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head = head.next;
            return head;
        }
        ListNode temp = head;

        if (n == 1) {
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            return head;
        }

        temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        int finalcount = count - n;
        ListNode temp2 = head;
        int i = 1;

        if (finalcount == 0) {
            head = head.next;
            return head;
        }

        while (i != finalcount) {
            temp2 = temp2.next;
            i++;
        }

        temp2.next = temp2.next.next;
        return head;
    }
}