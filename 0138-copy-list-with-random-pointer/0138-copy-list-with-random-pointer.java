/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Map to store the old nodes as keys and their copies as values

        if (head == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        
        // First pass: Create a copy of each node and store it in the map
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        
        // Second pass: Assign the next and random pointers for the copied nodes
        temp = head;
        while (temp != null) {
            Node copiedNode = map.get(temp);
            copiedNode.next = map.get(temp.next);
            copiedNode.random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }
}