package data_structures.queue.array_queue;

public class Main {

    public static void main(String[] args) {

        // Create a queue with a capacity of 5
        ArrayQueue queue = new ArrayQueue(5);

        // Check if the queue is empty using the isEmpty function
        System.out.println("Is the queue empty? " + queue.isEmpty()); // true (initially empty)

        // Enqueue items into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Display the contents of the queue using the printQueue function
        queue.printQueue(); // Queue: 1 2 3

        // Check the size of the queue using the size function
        System.out.println("Queue size: " + queue.size()); // 3

        // Peek at the front element without removing it using the peek function
        int peekedItem = queue.peek();
        System.out.println("Peeked item: " + peekedItem); // Peeked item: 1

        // Dequeue items from the queue and display the dequeued item
        int dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem); // Dequeued item: 1
        queue.printQueue(); // Queue: 2 3

        // Check if the queue is empty again
        System.out.println("Is the queue empty? " + queue.isEmpty()); // false (queue still contains elements)

        // Clear the queue using the clearQueue function
        queue.clearQueue();
        queue.printQueue(); // Queue:

        // Check if the queue is empty after clearing
        System.out.println("Is the queue empty? " + queue.isEmpty()); // true (queue has been cleared)
    }
}
