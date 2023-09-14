# MaxHeap Class (Based on AVL Tree)

The `MaxHeap` class is an implementation of a max-heap data structure in Java, utilizing an AVL tree as its underlying structure. A max-heap is a binary tree where the parent node has a value greater than or equal to its child nodes. This class provides methods for inserting elements into the heap, extracting the maximum element, and maintaining the max-heap property.

## Class Structure

The `MaxHeap` class has the following components:

- `avlTree`: An AVL tree that represents the max-heap.
- `insert(int data)`: Inserts an element into the max-heap while maintaining the max-heap property.
- `extractMax() -> int`: Removes and returns the maximum element from the max-heap.
- `isEmpty() -> boolean`: Checks if the max-heap is empty.
- `getMax() -> int`: Returns the maximum element from the max-heap without removing it.
- `printHeap()`: Prints the contents of the max-heap.

## Functions

### `MaxHeap()`

Constructor: Initializes an empty max-heap based on an AVL tree.

### `insert(int data)`

Inserts an element into the max-heap. The element is added to the AVL tree, and the AVL tree's properties are maintained, ensuring that it behaves as a max-heap.

### `extractMax() -> int`

Removes and returns the maximum element from the max-heap. The AVL tree is updated to maintain the max-heap property.

### `isEmpty() -> boolean`

Checks if the max-heap is empty. Returns `true` if the heap is empty; otherwise, returns `false`.

### `getMax() -> int`

Returns the maximum element from the max-heap without removing it.

### `printHeap()`

Prints the contents of the max-heap based on an inorder reverse traversal of the underlying AVL tree.

## Usage Example

```java
// Create a new max-heap
MaxHeap maxHeap = new MaxHeap();

// Insert elements into the max-heap
maxHeap.insert(10);
maxHeap.insert(5);
maxHeap.insert(15);
maxHeap.insert(20);

// Extract and remove the maximum element
int maxValue = maxHeap.extractMax(); // Should return 20

// Get the maximum element without removing it
int maxElement = maxHeap.getMax(); // Should return 15

// Check if the max-heap is empty
boolean isEmpty = maxHeap.isEmpty(); // Should return false

// Print the contents of the max-heap
maxHeap.printHeap(); // Should print the remaining elements
