package data_structures.linked_list;

public class Main {

    public static void main(String[] args) {

        // Create a new linked list
        LinkedList linkedList = new LinkedList();

        // Check if the linked list is empty
        System.out.println("Is the linked list empty? " + linkedList.isEmpty());

        // Add nodes to the linked list
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);

        // Print the first element of linked list
        System.out.println("First element: " + linkedList.getHead());

        // Print the current state of the linked list
        linkedList.printList();

        // Insert nodes at specific positions
        linkedList.insertNode(2, 7);
        linkedList.insertNode(1, 12);

        // Print the updated linked list
        System.out.print("Linked List: ");
        linkedList.printList();

        // Find the index of a value in the linked list
        System.out.println("Index of value (4): " + linkedList.findNode(4));

        // Get the size of the linked list
        System.out.println("Size of the list: " + linkedList.size());

        // Delete a node with a specific value
        linkedList.deleteNode(12);

        // Print the linked list after deletion
        System.out.print("Linked List: ");
        linkedList.printList();

        linkedList.remove(2);

        // Print the linked list after deletion
        System.out.print("Linked List: ");
        linkedList.printList();

        // Get the updated size of the linked list
        System.out.println("Size of the list: " + linkedList.size());

        // Check if the linked list is empty after deletion
        System.out.println("Is the linked list empty? " + linkedList.isEmpty());

        // Clear the linked list
        linkedList.clearList();
        System.out.println("Linked list cleared");

        // Print the cleared linked list
        System.out.print("Linked List: ");
        linkedList.printList();

        // Get the size of the cleared linked list
        System.out.println("Size of the list: " + linkedList.size());

        // Check if the linked list is empty after clearing
        System.out.println("Is the linked list empty? " + linkedList.isEmpty());

        // Print the first element of linked list
        System.out.println("First element: " + linkedList.getHead());
    }
}
