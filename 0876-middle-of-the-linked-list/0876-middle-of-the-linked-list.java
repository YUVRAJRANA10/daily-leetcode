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
    public ListNode middleNode(ListNode head) {

        // ListNode tortoise = head;
        // ListNode hare = head;

        ListNode temp = head;

        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        int mid = count / 2;
        ListNode temp2 = head;

        while(mid > 0){
           mid--;
           temp2 = temp2.next;
        }


        return temp2;

        

    }

}