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

    // Get the value of the head (first element) of the linked list.
    public int getHead() {
        if (head != null) {
            return head.data;
        } else {
            throw new IllegalStateException("The linked list is empty.");
        }
    }

    // Delete the node with the specified index if it exists in the linked list.
    public void remove(int index) {
        // Check for invalid index or an empty list
        if (isEmpty() || index < 0) {
            System.err.println("Invalid index or the list is empty.");
            return;
        }

        // If the index is 0, remove the element at the beginning of the list
        if (index == 0) {
            head = head.next;
            return;
        }

        int currIndex = 0;
        Node currNode = head;
        while (currIndex < index - 1 && currNode.next != null) {
            currNode = currNode.next;
            currIndex++;
        }

        // Remove the element at the specified index
        if (currNode.next != null) {
            currNode.next = currNode.next.next;
        } else {
            System.err.println("Index out of bounds.");
        }
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

    // Swap the data of two nodes at the specified indices.
    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size() || index2 < 0 || index2 >= size()) {
            System.err.println("Invalid indices for swap.");
            return;
        }

        Node node1 = head;
        Node node2 = head;
        Node prevNode1 = null;
        Node prevNode2 = null;

        int currentIndex = 0;

        while (currentIndex < index1) {
            prevNode1 = node1;
            node1 = node1.next;
            currentIndex++;
        }

        currentIndex = 0;

        while (currentIndex < index2) {
            prevNode2 = node2;
            node2 = node2.next;
            currentIndex++;
        }

        // Swap the nodes
        if (prevNode1 != null) {
            prevNode1.next = node2;
        } else {
            head = node2;
        }

        if (prevNode2 != null) {
            prevNode2.next = node1;
        } else {
            head = node1;
        }

        Node temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;
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
    }

    // Print the contents of the linked list from the beginning to the end.
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Retrieve an element at a specific index
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node currNode = head;
        int currIndex = 0;

        while (currNode != null) {
            if (currIndex == index) {
                return currNode.data;
            }
            currNode = currNode.next;
            currIndex++;
        }

        // If a specific index is not found, you can either throw an exception or return a default value.
        // For example, you can throw an exception with:
        // throw new IndexOutOfBoundsException("Index not found");

        // Alternatively, you can return a default value:
        // return 0; // Or any other suitable default value
        return -1; // We've set the default value to -1 in this example.
    }

}
