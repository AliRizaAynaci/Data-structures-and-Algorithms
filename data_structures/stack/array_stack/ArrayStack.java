package data_structures.stack.array_stack;

public class ArrayStack {

    private int[] array;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1; // Stack boşken top -1 olarak başlar.
    }

    // Push an element onto the Stack.
    public void push(int data) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        array[++top] = data;
    }

    // Pop the top element from the Stack and return it.
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }

    // Peek at the top element of the Stack without removing it.
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }

    // Check if the Stack is empty.
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the Stack is full.
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the size of the Stack.
    public int size() {
        return top + 1;
    }

    // Clear the Stack, making it empty.
    public void clear() {
        top = -1;
    }

    // Print the contents of the Stack.
    public void print() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
