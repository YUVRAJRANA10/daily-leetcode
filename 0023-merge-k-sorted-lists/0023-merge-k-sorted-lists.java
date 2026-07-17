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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null)return null;

        return mergeAll(lists, 0, lists.length - 1);
    }

    public ListNode mergeAll(ListNode[] lists, int start, int end) {
        if (start == end)
            return lists[start];
        int mid = start + (end - start) / 2;
        ListNode left = mergeAll(lists, start, mid);
        ListNode right = mergeAll(lists, mid + 1, end);
        return mergeTwo(left, right);
    }


    public ListNode mergeTwo(ListNode l1, ListNode l2){


             ListNode dummy = new ListNode();
             ListNode tail = dummy ;

             while(l1!= null && l2 != null){

                if(l1.val <= l2.val ){

                    tail.next = l1;
                    l1 = l1.next;
                }
                else{
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
             }

             if(l1!=null){
                tail.next = l1;
             }
             else if(l2 != null){
                tail.next = l2;
             }

             return dummy.next;
    }
}