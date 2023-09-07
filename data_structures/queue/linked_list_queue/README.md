# Linked List Queue Class

The `LinkedListQueue` class is an implementation of a queue using a linked list in Java. It provides methods for checking if the queue is empty, enqueuing (adding) elements to the back of the queue, dequeuing (removing and returning) elements from the front of the queue, getting the size of the queue, printing the contents of the queue, and clearing the queue.

## Class Structure

The `LinkedListQueue` class uses a `LinkedList` from your previous code as the underlying data structure. It has the following components:

- `linkedList`: An instance of the `LinkedList` class used as the basis for the queue.

## Functions

### `LinkedListQueue()`

Constructor: Initializes an empty queue using a linked list.

### `isEmpty() -> boolean`

Checks if the queue is empty.

### `enqueue(int data)`

Enqueues (adds) an element with the given `data` to the back of the queue.

### `dequeue() -> int`

Dequeues (removes and returns) an element from the front of the queue. If the queue is empty, it returns -1 and prints an error message.

### `size() -> int`

Returns the number of elements in the queue.

### `printQueue()`

Prints the contents of the queue from the front to the back.

### `clearQueue()`

Clears the entire queue, making it empty.

## Usage Example

```java
// Create a new linked list-based queue
LinkedListQueue myQueue = new LinkedListQueue();

// Enqueue elements to the queue
myQueue.enqueue(10);
myQueue.enqueue(20);
myQueue.enqueue(30);

// Dequeue an element from the front of the queue
int dequeuedItem = myQueue.dequeue(); // Should return 10

// Check if the queue is empty
boolean isEmpty = myQueue.isEmpty(); // Should return false

// Get the size of the queue
int size = myQueue.size(); // Should return 2

// Print the contents of the queue
myQueue.printQueue(); // Should print: "Queue: 20 -> 30 -> null"

// Clear the queue
myQueue.clearQueue(); // Should print: "Queue cleared"

// Print the final state of the queue
myQueue.printQueue(); // Should print: "Queue: null"
