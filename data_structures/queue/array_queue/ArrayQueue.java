package data_structures.queue.array_queue;

public class ArrayQueue<T> {

    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the Queue class.
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the queue is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full.
    public boolean isFull() {
        return size == capacity;
    }

    // Add an item to the queue (enqueue).
    public void enqueue(int item) {
        if (isFull()) {
            System.err.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        size++;
    }

    // Remove and return an item from the queue (dequeue).
    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty. Cannot dequeue.");
            return -1; // You can return a default value or handle the error as needed.
        }
        int item = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Get the number of elements in the queue.
    public int size() {
        return size;
    }

    // Clear the queue.
    public void clearQueue() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue cleared");
    }

    // View the element at the front of the queue without removing it (peek).
    public int peek() {
        if (isEmpty()) {
            System.err.println("Queue is empty. Cannot peek.");
            return -1; // You can return a default value or handle the error as needed.
        }
        return queueArray[front];
    }

    // Display the contents of the queue.
    public void printQueue() {
        System.out.print("Queue: ");
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[current] + " ");
            current = (current + 1) % capacity;
        }
        System.out.println();
    }
}

