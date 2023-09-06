package data_structures.linked_list;

public class LinkedList {

    private Node head;

    // Constructor
    public LinkedList() {
        this.head = null; // Initialize the head to null, creating an empty linked list.
    }

    // Check if the linked list is empty.
    public boolean isEmpty() {
        return head == null;
    }

    // Add a new node with the given data to the end of the linked list.
    public void addNode(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set the new node as the head.
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            // Traverse the list to find the last node.
            while (current.next != null) {
                current = current.next;
            }
            // Insert the new node at the end.
            current.next = newNode;
        }
    }

    // Insert a new node with the given value at the specified index.
    // If the index is invalid, do nothing.
    public void insertNode(int index, int val) {
        if (index < 0) return;

        int currIndex = 1;
        Node currNode = head;
        while ((index > currIndex) && currNode != null) {
            currNode = currNode.next;
            currIndex++;
        }

        if (index > 0 && currNode == null) return;

        Node newNode = new Node(val);

        // Insert as the first element if the index is 0.
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
    }

    // Find and return the index (0-based) of the first node with the specified value.
    // If the value is not found, return 0.
    public int findNode(int val) {
        Node currNode = head;
        int currIndex = 0;

        while (currNode != null && currNode.data != val) {
            currNode = currNode.next;
            currIndex++;
        }

        if (currNode != null) return currIndex;

        return 0;
    }

    // Delete the first node with the specified value if it exists in the linked list.
    public void deleteNode(int val) {
        if (isEmpty()) return;

        if (head.data == val) {
            head = head.next;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            if (currNode.next.data == val) {
                currNode.next = currNode.next.next;
                return;
            }
            currNode = currNode.next;
        }
    }

    // Get the number of nodes in the linked list.
    public int size() {
        if (isEmpty()) return 0;

        Node currNode = head;
        int currIndex = 0;

        while (currNode != null) {
            currNode = currNode.next;
            currIndex++;
        }
        return currIndex;
    }

    // Clear the entire linked list, making it empty.
    public void clearList() {
        head = null;
        System.out.println("Linked list cleared");
    }

    // Print the contents of the linked list from the beginning to the end.
    public void printList() {
        Node currNode = head;
        System.out.print("Linked List: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
