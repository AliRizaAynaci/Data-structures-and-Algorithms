# Array Queue Class

The `ArrayQueue` class is an implementation of a queue using an array in Java. It provides methods for checking if the queue is empty, checking if it's full, enqueuing (adding) elements to the back of the queue, dequeuing (removing and returning) elements from the front of the queue, getting the size of the queue, clearing the queue, peeking at the element at the front of the queue, and printing the contents of the queue.

## Class Structure

The `ArrayQueue` class has the following components:

- `queueArray`: An integer array used to store the queue elements.
- `front`: An integer representing the index of the front element.
- `rear`: An integer representing the index of the rear element.
- `size`: An integer representing the current number of elements in the queue.
- `capacity`: An integer representing the maximum capacity of the queue.

## Functions

### `ArrayQueue(int capacity)`

Constructor: Initializes an array-based queue with the given `capacity`.

### `isEmpty() -> boolean`

Checks if the queue is empty.

### `isFull() -> boolean`

Checks if the queue is full.

### `enqueue(int item)`

Enqueues (adds) an element with the given `item` to the back of the queue. If the queue is full, it prints an error message and does nothing.

### `dequeue() -> int`

Dequeues (removes and returns) an element from the front of the queue. If the queue is empty, it prints an error message and returns -1.

### `size() -> int`

Returns the number of elements in the queue.

### `clearQueue()`

Clears the entire queue, making it empty.

### `peek() -> int`

Views the element at the front of the queue without removing it. If the queue is empty, it prints an error message and returns -1.

### `printQueue()`

Prints the contents of the queue from the front to the back.

## Usage Example

```java
// Create a new array-based queue with a capacity of 5
ArrayQueue myQueue = new ArrayQueue(5);

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

// Peek at the front element of the queue
int frontElement = myQueue.peek(); // Should return 20

// Print the contents of the queue
myQueue.printQueue(); // Should print: "Queue: 20 30"

// Clear the queue
myQueue.clearQueue(); // Should print: "Queue cleared"

// Print the final state of the queue
myQueue.printQueue(); // Should print: "Queue: "
