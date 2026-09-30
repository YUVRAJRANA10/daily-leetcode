import java.util.HashMap;
import java.util.Map;

class LFUCache {

    // Node structure storing key, value, frequency, and pointers
    private class Node {
        int key;
        int value;
        int freq;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1; // Initial frequency when added
        }
    }

    // Doubly Linked List for a specific frequency group
    private class DoublyLinkedList {
        Node head;
        Node tail;
        int size;

        DoublyLinkedList() {
            head = new Node(-1, -1); // Dummy head
            tail = new Node(-1, -1); // Dummy tail
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        // Add node right after head (most recently used for this frequency)
        void addNode(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        // Remove a specific node from the list
        void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        // Remove and return the least recently used node (node before dummy tail)
        Node removeTail() {
            if (size == 0) return null;
            Node lruNode = tail.prev;
            removeNode(lruNode);
            return lruNode;
        }
    }

    private final int capacity;
    private int minFreq;
    private final Map<Integer, Node> keyNodeMap;
    private final Map<Integer, DoublyLinkedList> freqListMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyNodeMap = new HashMap<>();
        this.freqListMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyNodeMap.containsKey(key)) {
            return -1;
        }

        Node node = keyNodeMap.get(key);
        updateNodeFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        // Key already exists: update value & frequency
        if (keyNodeMap.containsKey(key)) {
            Node node = keyNodeMap.get(key);
            node.value = value;
            updateNodeFrequency(node);
            return;
        }

        // Cache is full: evict the least frequently used node
        if (keyNodeMap.size() == capacity) {
            DoublyLinkedList minList = freqListMap.get(minFreq);
            Node evictedNode = minList.removeTail();
            if (evictedNode != null) {
                keyNodeMap.remove(evictedNode.key);
            }
        }

        // Insert new node
        Node newNode = new Node(key, value);
        minFreq = 1; // New element starts with frequency 1
        
        freqListMap.computeIfAbsent(1, k -> new DoublyLinkedList()).addNode(newNode);
        keyNodeMap.put(key, newNode);
    }

    // Helper function to update node's frequency and move it across lists
    private void updateNodeFrequency(Node node) {
        int oldFreq = node.freq;
        DoublyLinkedList oldList = freqListMap.get(oldFreq);
        oldList.removeNode(node);

        // If old minFreq list becomes empty, increment global minFreq
        if (oldFreq == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;
        freqListMap.computeIfAbsent(node.freq, k -> new DoublyLinkedList()).addNode(node);
    }
}