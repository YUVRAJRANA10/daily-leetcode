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
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
      if(head == null|| head.next == null)return head;

        ListNode temp = head;
        
            while( temp != null && temp.next != null){
            int value = gcd(temp.val,temp.next.val);
            ListNode newnode = new ListNode(value);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = temp.next.next;

        }
        return head;
    }
}