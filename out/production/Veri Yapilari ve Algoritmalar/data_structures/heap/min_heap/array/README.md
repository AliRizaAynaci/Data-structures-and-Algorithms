# MinHeap Class

The `MinHeap` class is an implementation of a min-heap data structure in Java. A min-heap is a binary tree where the parent node has a value less than or equal to its child nodes. This class provides methods for inserting elements into the heap, extracting the minimum element, and maintaining the min-heap property.

## Class Structure

The `MinHeap` class has the following components:

- `heapList`: A dynamic list that represents the min-heap.
- `insert(T element)`: Inserts an element into the min-heap while maintaining the min-heap property.
- `extractMin() -> T`: Removes and returns the minimum element from the min-heap.
- `isEmpty() -> boolean`: Checks if the min-heap is empty.

## Functions

### `MinHeap()`

Constructor: Initializes an empty min-heap.

### `insert(T element)`

Inserts an element into the min-heap. The element is added to the end of the heap and then moved up the heap to its correct position to maintain the min-heap property.

### `extractMin() -> T`

Removes and returns the minimum element from the min-heap. The root element (minimum) is replaced with the last element in the heap, and the heap is adjusted by moving the new root down the tree to maintain the min-heap property.

### `isEmpty() -> boolean`

Checks if the min-heap is empty. Returns `true` if the heap is empty; otherwise, returns `false`.

### `heapifyUp()`

Private helper function: Moves an element up the heap to maintain the min-heap property.

### `heapifyDown()`

Private helper function: Moves an element down the heap to maintain the min-heap property.

### `swap(int index1, int index2)`

Private helper function: Swaps two elements in the heap.

## Usage Example

```java
// Create a new min-heap
MinHeap<Integer> minHeap = new MinHeap<>();

// Insert elements into the min-heap
minHeap.insert(5);
minHeap.insert(3);
minHeap.insert(8);
minHeap.insert(1);

// Extract and remove the minimum element
int minValue = minHeap.extractMin(); // Should return 1

// Check if the min-heap is empty
boolean isEmpty = minHeap.isEmpty(); // Should return false
