package data_structures.queue.linked_list_queue;

public class Main {

    public static void main(String[] args) {

        // Create a Queue
        LinkedListQueue queue = new LinkedListQueue();

        // Check if the queue is empty using the isEmpty function
        System.out.println("Is the queue empty? " + queue.isEmpty()); // true (initially empty)

        // Enqueue items into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Display the content of the queue using the printQueue function
        queue.printQueue(); // Queue: 1 -> 2 -> 3 -> null

        // Check the size of the queue using the size function
        System.out.println("Queue size: " + queue.size()); // 3

        // Print the peeked item from the queue.
        System.out.println("Peeked item: " + queue.peek());

        // Dequeue items from the queue and display the dequeued item
        int dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem); // Dequeued item: 1
        queue.printQueue(); // Queue: 2 -> 3 -> null

        // Check if the queue is empty again
        System.out.println("Is the queue empty? " + queue.isEmpty()); // false (queue still contains elements)

        // Check the size of the queue using the size function
        System.out.println("Queue size: " + queue.size()); // 2

        // Clear the queue using the clearList function
        queue.clearQueue();
        queue.printQueue(); // Queue: null

        // Check if the queue is empty after clearing
        System.out.println("Is the queue empty? " + queue.isEmpty()); // true (queue has been cleared)
    }
}

