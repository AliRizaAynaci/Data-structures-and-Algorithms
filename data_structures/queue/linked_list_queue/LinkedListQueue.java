package data_structures.queue.linked_list_queue;

import data_structures.linked_list.LinkedList;

public class LinkedListQueue {

    private LinkedList linkedList;

    public LinkedListQueue() {
        linkedList = new LinkedList();
    }

    // Check if the queue is empty.
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // Enqueue (add) an item to the back the queue.
    public void enqueue(int data) {
        linkedList.addNode(data);
    }

    // Dequeue (remove and return) an item from the front of the queue.
    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty.");
            return -1;
        }
        int front = linkedList.getHead();
        linkedList.remove(0);
        return front;
    }

    // Get the size (number of elements) of the queue.
    public int size() {
        return linkedList.size();
    }

    // Print the contents of the queue from front to back.
    public void printQueue() {
        System.out.print("Queue: ");
        linkedList.printList();
    }

    public void clearQueue() {
        linkedList.clearList();
        System.out.println("Queue cleared");
    }
}
