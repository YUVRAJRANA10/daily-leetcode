class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        int count = 0;

        if (head == null) {
            return head;
        }

        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int num = count / k;

        ListNode prev = null;
        ListNode curr = head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy; // extra pointer for connecting groups

        while (num > 0) {

            int n = k;

            ListNode groupHead = curr; // current group's original head

            prev = null;

            while (n > 0) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                n--;
            }

            // connect previous group with reversed group
            prevGroup.next = prev;

            // connect reversed group's tail to next part
            groupHead.next = curr;

            // move prevGroup forward for next iteration
            prevGroup = groupHead;

            num--;
        }

        return dummy.next;
    }
}