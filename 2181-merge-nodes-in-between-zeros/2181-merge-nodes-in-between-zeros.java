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
    public ListNode mergeNodes(ListNode head) {
        if(head == null)return head;;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp = head;
        while(temp != null){
            int data = 0;
            if(temp.val == 0){
                temp = temp.next;
                while(temp!=null && temp.val != 0){
                   data+=temp.val;
                   temp = temp.next;
                }
                if(data!=0){
                    ListNode newnode = new ListNode(data);
                    tail.next = newnode;
                    tail = newnode;
                }
                continue;
            }
            if(temp!=null && temp.next != null){
            temp = temp.next;}
            }

        return dummy.next;
    }
}