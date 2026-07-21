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
    public ListNode deleteDuplicates(ListNode head) {
        
        Map<Integer,Integer> map = new LinkedHashMap<>();

        ListNode temp = head;
        while(temp != null){

              map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }


        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        for(int x : map.keySet()){

            if(map.get(x) > 1){
                continue;
            }
            tail.next = new ListNode(x); 
            tail = tail.next;       
    }

    return dummy.next;}
}