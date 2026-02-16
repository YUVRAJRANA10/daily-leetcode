/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     

       ListNode fast = head;
       ListNode slow = head;
         int pos ;
         if(head == null || head.next == null){
            return null;
         }
        
       while(fast.next != null && fast.next.next != null){

        fast = fast.next.next;
        slow = slow.next;

        if(fast == slow){
             slow = head;
             pos = 0;
             while(slow != fast){
                slow = slow.next; 
                fast = fast.next;

                pos++;
             }

             return slow;

        }
       }

       return null;
    


    }
}