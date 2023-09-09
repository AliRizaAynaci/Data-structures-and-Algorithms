package data_structures.stack.linked_list_stack;

public class Main {

    public static void main(String[] args) {
        // Create a new linked list-based stack
        LinkedListStack stack = new LinkedListStack();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        // Pop an element from the stack
        int poppedItem = stack.pop(); // Should return 30
        System.out.println(poppedItem);

        // Peek at the top element of the stack
        int topElement = stack.peek(); // Should return 20
        System.out.println(topElement);

        stack.print();

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty(); // S hould return false
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the stack
        int size = stack.size(); // Should return 2
        System.out.println("Stack size: " + size);

        // Print the contents of the stack
        stack.print(); // Should print: "Linked List: 20 -> 10 -> null"

        // Clear the stack
        stack.clear(); // Should print: "Linked list cleared"

        // Print the final state of the stack
        stack.print(); // Should print: "Linked List: null"
    }
}

