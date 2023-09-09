package data_structures.stack.linked_list_stack;

import data_structures.linked_list.LinkedList;

public class LinkedListStack {
    private LinkedList list;

    public LinkedListStack() {
        this.list = new LinkedList(); // Create a Stack using LinkedList.
    }

    // Push an element onto the Stack.
    public void push(int data) {
        list.addNode(data);
    }

    // Pop the top element from the Stack and return it.
    // Remove and return the top element from the Stack (LIFO - Last-In-First-Out)
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int size = list.size();
        int lastIndex = size - 1;
        int top = list.get(lastIndex); // Get the element at the end of the list
        list.remove(lastIndex); // Remove the element at the end of the list
        return top;
    }


    // Peek at the top element of the Stack without removing it.
    // Peek at the top element of the Stack without removing it (LIFO - Last-In-First-Out)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int size = list.size();
        int lastIndex = size - 1;
        return list.get(lastIndex); // Get the element at the end of the list
    }


    // Check if the Stack is empty.
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the Stack.
    public int size() {
        return list.size();
    }

    // Clear the Stack, making it empty.
    public void clear() {
        list.clearList();
    }

    // Print the contents of the Stack.
    public void print() {
        System.out.print("Stack: ");
        list.printList();
    }
}
