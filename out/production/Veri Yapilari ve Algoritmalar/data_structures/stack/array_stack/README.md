# Array Stack Class

The `ArrayStack` class is an implementation of a stack using an array in Java. It provides methods for pushing (adding) elements onto the stack, popping (removing and returning) elements from the top of the stack, peeking at the top element without removing it, checking if the stack is empty, checking if the stack is full, getting the size of the stack, clearing the stack, and printing its contents.

## Class Structure

The `ArrayStack` class has the following components:

- `array`: An array used to store stack elements.
- `top`: An integer representing the index of the top element in the stack.
- `capacity`: The maximum capacity of the stack.

## Functions

### `ArrayStack(int capacity)`

Constructor: Initializes an empty stack using an array with the specified `capacity`.

### `push(int data)`

Pushes (adds) an element with the given `data` onto the top of the stack. If the stack is full, it throws an exception.

### `pop() -> int`

Pops (removes and returns) the top element from the stack. If the stack is empty, it throws an exception.

### `peek() -> int`

Peeks at the top element of the stack without removing it. If the stack is empty, it throws an exception.

### `isEmpty() -> boolean`

Checks if the stack is empty.

### `isFull() -> boolean`

Checks if the stack is full.

### `size() -> int`

Returns the number of elements in the stack.

### `clear()`

Clears the entire stack, making it empty.

### `print()`

Prints the contents of the stack from top to bottom.

## Usage Example

```java
// Create a new array-based stack with a capacity of 5
ArrayStack stack = new ArrayStack(5);

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

// Check if the stack is full
boolean isFull = stack.isFull(); // Should return false

// Get the size of the stack
int size = stack.size(); // Should return 2

// Print the contents of the stack
stack.print(); // Should print: "Stack: 10 20"

// Clear the stack
stack.clear();

// Print the final state of the stack
stack.print(); // Should print: "Stack:"
