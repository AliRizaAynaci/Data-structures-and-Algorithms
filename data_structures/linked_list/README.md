# Linked List Class

The `LinkedList` class is a basic implementation of a singly linked list in Java. It provides methods for adding, inserting, finding, deleting nodes, checking if the list is empty, getting the size of the list, clearing the list, and printing the list.

## Class Structure

The `LinkedList` class has the following components:

- `Node`: An inner class representing a node in the linked list.
- `head`: A reference to the first node in the list.

## Functions

### `LinkedList()`

Constructor: Initializes an empty linked list.

### `isEmpty() -> boolean`

Checks if the linked list is empty.

### `addNode(int data)`

Adds a new node with the given `data` at the end of the linked list.

### `insertNode(int index, int val)`

Inserts a new node with the given `val` at the specified `index`. If the index is invalid, it does nothing. If `index` is 0, the new node is inserted at the beginning.

### `findNode(int val) -> int`

Searches for a node with the specified `val` and returns its index (0-based). If the value is not found, it returns 0.

### `deleteNode(int val)`

Deletes the first node with the specified `val` if it exists in the linked list.

### `size() -> int`

Returns the number of nodes in the linked list.

### `clearList()`

Clears the entire linked list, making it empty.

### `printList()`

Prints the contents of the linked list from the beginning to the end.

## Usage Example

```java
// Create a new linked list
LinkedList myList = new LinkedList();

// Add nodes to the list
myList.addNode(10);
myList.addNode(20);
myList.addNode(30);

// Insert a node at a specific index
myList.insertNode(1, 15);

// Find the index of a node with value 20
int index = myList.findNode(20); // Should return 2

// Delete a node with value 10
myList.deleteNode(10);

// Get the size of the list
int size = myList.size(); // Should return 3

// Clear the list
myList.clearList();

// Print the final state of the list
myList.printList(); // Should print: "Linked List: null"
