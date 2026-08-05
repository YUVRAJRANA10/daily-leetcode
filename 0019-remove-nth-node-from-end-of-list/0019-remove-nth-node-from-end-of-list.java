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
        if(head == null)return head;
        if(n == 0)return head;
        int count = 0;
       ListNode temp = head;
       while(temp != null){
        count++;
        temp= temp.next;
       }
       if(count == n){
        head = head.next;
        return head;
       }
       
       temp = head;
       int start = count - n;
       for(int i = 1; i < start; i++){
        temp = temp.next;
       }

       temp.next = temp.next.next;
       return head;

    }
}