# Linked List Stack Class

The `LinkedListStack` class is an implementation of a stack using a linked list in Java. It provides methods for pushing (adding) elements onto the stack, popping (removing and returning) elements from the top of the stack, peeking at the top element without removing it, checking if the stack is empty, getting the size of the stack, clearing the stack, and printing its contents.

## Class Structure

The `LinkedListStack` class uses an instance of the `LinkedList` class as the underlying data structure. It has the following components:

- `list`: An instance of the `LinkedList` class used to store stack elements.

## Functions

### `LinkedListStack()`

Constructor: Initializes an empty stack using a linked list.

### `push(int data)`

Pushes (adds) an element with the given `data` onto the top of the stack.

### `pop() -> int`

Pops (removes and returns) the top element from the stack. If the stack is empty, it throws an exception.

### `peek() -> int`

Peeks at the top element of the stack without removing it. If the stack is empty, it throws an exception.

### `isEmpty() -> boolean`

Checks if the stack is empty.

### `size() -> int`

Returns the number of elements in the stack.

### `clear()`

Clears the entire stack, making it empty.

### `print()`

Prints the contents of the stack from top to bottom.

## Usage Example

```java
// Create a new linked list-based stack
LinkedListStack stack = new LinkedListStack();

// Push elements onto the stack
stack.push(10);
stack.push(20);
stack.push(30);

// Pop an element from the stack
int poppedItem = stack.pop(); // Should return 30

// Peek at the top element of the stack
int topElement = stack.peek(); // Should return 20

// Check if the stack is empty
boolean isEmpty = stack.isEmpty(); // Should return false

// Get the size of the stack
int size = stack.size(); // Should return 2

// Print the contents of the stack
stack.print(); // Should print: "Linked List: 20 -> 10 -> null"

// Clear the stack
stack.clear(); // Should print: "Linked list cleared"

// Print the final state of the stack
stack.print(); // Should print: "Linked List: null"
