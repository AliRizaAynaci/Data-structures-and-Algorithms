# Heap Sort Algorithm

Heap Sort is a comparison-based sorting algorithm that utilizes a binary heap data structure to sort elements. It has a time complexity of O(n log n) in the worst-case scenario, making it an efficient sorting algorithm for large datasets.

## How Heap Sort Works

1. **Build Max Heap**: First, the algorithm builds a max heap from the input array. A max heap is a binary tree where the parent node is greater than or equal to its child nodes.

2. **Heapify**: After building the max heap, the largest element (at the root) is moved to the end of the array. The remaining elements are reorganized to maintain the max heap property. This process is called heapify.

3. **Repeat Heapify**: Steps 1 and 2 are repeated until the entire array is sorted. After each iteration, the largest unsorted element is moved to the end of the array.

4. **Sorted Array**: The sorted elements are placed at the end of the array, and the size of the heap is reduced by one. This continues until the entire array is sorted.

## Example

Let's walk through an example using the array: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Initial Array

Unsorted array: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Step 1: Build Max Heap

- Max Heap: [15, 8, 9, 7, 2, 5, 4, 3, 6]

### Step 2: Heapify and Swap

- Max Heap: [9, 8, 5, 7, 2, 4, 3, 15, 6]

### Step 3: Repeat Heapify

- Max Heap: [8, 7, 5, 6, 2, 4, 3, 9, 15]
- Sorted: [15]

Continue these steps until the entire array is sorted.

### Sorted Array

The Heap Sort algorithm has sorted the array in ascending order: [2, 3, 4, 5, 6, 7, 8, 9, 15].

## Complexity Analysis

- **Time Complexity**: O(n log n) in the worst-case scenario.
- **Space Complexity**: O(1) - Heap Sort is an in-place sorting algorithm.

Heap Sort is a stable sorting algorithm, which means it preserves the relative order of equal elements. It is particularly useful when you need a simple, in-place sorting algorithm with good average and worst-case time complexities.
