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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;


        ListNode temp = head;
        int i  = 0;
   
           while(temp != null){
            ListNode newnode = new ListNode(temp.val);

             if(i % 2 == 0){
                      tail.next = newnode;
                      tail = newnode;
             }
             temp = temp.next;
                     i++;
        }


        i = 0;
        temp = head;

  

     while(temp != null){
            ListNode newnode = new ListNode(temp.val);

             if(i % 2 == 1){
                      tail.next = newnode;
                      tail = newnode;
             }
             temp = temp.next;
                     i++;
        }

        return dummy.next;
    }
}