# MinHeap Class (Based on AVL Tree)

The `MinHeap` class is an implementation of a min-heap data structure in Java, utilizing an AVL tree as its underlying structure. A min-heap is a binary tree where the parent node has a value less than or equal to its child nodes. This class provides methods for inserting elements into the heap, extracting the minimum element, and maintaining the min-heap property.

## Class Structure

The `MinHeap` class has the following components:

- `avlTree`: An AVL tree that represents the min-heap.
- `insert(int data)`: Inserts an element into the min-heap while maintaining the min-heap property.
- `extractMin() -> int`: Removes and returns the minimum element from the min-heap.
- `isEmpty() -> boolean`: Checks if the min-heap is empty.
- `getMin() -> int`: Returns the minimum element from the min-heap without removing it.
- `printHeap()`: Prints the contents of the min-heap.

## Functions

### `MinHeap()`

Constructor: Initializes an empty min-heap based on an AVL tree.

### `insert(int data)`

Inserts an element into the min-heap. The element is added to the AVL tree, and the AVL tree's properties are maintained, ensuring that it behaves as a min-heap.

### `extractMin() -> int`

Removes and returns the minimum element from the min-heap. The AVL tree is updated to maintain the min-heap property.

### `isEmpty() -> boolean`

Checks if the min-heap is empty. Returns `true` if the heap is empty; otherwise, returns `false`.

### `getMin() -> int`

Returns the minimum element from the min-heap without removing it.

### `printHeap()`

Prints the contents of the min-heap based on an inorder traversal of the underlying AVL tree.

## Usage Example

```java
// Create a new min-heap
MinHeap minHeap = new MinHeap();

// Insert elements into the min-heap
minHeap.insert(5);
minHeap.insert(3);
minHeap.insert(8);
minHeap.insert(1);

// Extract and remove the minimum element
int minValue = minHeap.extractMin(); // Should return 1

// Get the minimum element without removing it
int minElement = minHeap.getMin(); // Should return 3

// Check if the min-heap is empty
boolean isEmpty = minHeap.isEmpty(); // Should return false

// Print the contents of the min-heap
minHeap.printHeap(); // Should print the remaining elements
