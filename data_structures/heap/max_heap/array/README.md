# MaxHeap Class (Based on Array)

The `MaxHeap` class is an implementation of a max-heap data structure in Java, utilizing an array as its underlying structure. A max-heap is a binary tree where the parent node has a value greater than or equal to its child nodes. This class provides methods for inserting elements into the heap, extracting the maximum element, and maintaining the max-heap property.

## Class Structure

The `MaxHeap` class has the following components:

- `heapList`: An array that represents the max-heap.
- `insert(T element)`: Inserts an element into the max-heap while maintaining the max-heap property.
- `extractMax() -> T`: Removes and returns the maximum element from the max-heap.
- `isEmpty() -> boolean`: Checks if the max-heap is empty.
- `heapifyUp()`: Moves an element up the heap to maintain the max-heap property.
- `heapifyDown()`: Moves an element down the heap to maintain the max-heap property.
- `swap(int index1, int index2)`: Swaps two elements in the heap.

## Functions

### `MaxHeap()`

Constructor: Initializes an empty max-heap based on an array.

### `insert(T element)`

Inserts an element into the max-heap. The element is added to the array, and the max-heap properties are maintained, ensuring that it behaves as a max-heap.

### `extractMax() -> T`

Removes and returns the maximum element from the max-heap. The array is updated to maintain the max-heap property.

### `isEmpty() -> boolean`

Checks if the max-heap is empty. Returns `true` if the heap is empty; otherwise, returns `false`.

### `heapifyUp()`

Moves an element up the heap to maintain the max-heap property.

### `heapifyDown()`

Moves an element down the heap to maintain the max-heap property.

### `swap(int index1, int index2)`

Swaps two elements in the heap.

## Usage Example

```java
// Create a new max-heap
MaxHeap<Integer> maxHeap = new MaxHeap<>();

// Insert elements into the max-heap
maxHeap.insert(10);
maxHeap.insert(5);
maxHeap.insert(15);
maxHeap.insert(20);

// Extract and remove the maximum element
int maxValue = maxHeap.extractMax(); // Should return 20

// Check if the max-heap is empty
boolean isEmpty = maxHeap.isEmpty(); // Should return false

// Insert more elements
maxHeap.insert(25);
maxHeap.insert(30);

// Extract and remove the maximum element
int nextMaxValue = maxHeap.extractMax(); // Should return 30

// Print the contents of the max-heap
System.out.print("Max Heap: ");
while (!maxHeap.isEmpty()) {
    int element = maxHeap.extractMax();
    System.out.print(element + " ");
}
System.out.println(); // Should print the remaining elements in decreasing order
