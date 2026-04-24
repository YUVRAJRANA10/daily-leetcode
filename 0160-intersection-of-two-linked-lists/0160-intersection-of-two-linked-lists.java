/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
            
   
        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = headA;

        // store all nodes of A
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;

        // check nodes of B
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }


    
}