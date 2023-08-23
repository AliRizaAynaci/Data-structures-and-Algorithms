## Selection Sort Algorithm Example

Let's walk through the selection sort algorithm step by step using the array: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Initial Array

Our unsorted array is: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Step 1

1. Start with the first element, which is 7.
2. Find the smallest element among the remaining elements: 2 (at index 4).
3. Swap 7 and 2.
4. The array now looks like this: [2, 3, 5, 8, 7, 9, 4, 15, 6].

### Step 2

1. Move to the second element, which is 3.
2. Find the smallest element among the remaining elements: 3.
3. Swap 3 with itself (no change).
4. The array remains: [2, 3, 5, 8, 7, 9, 4, 15, 6].

### Step 3

1. Move to the third element, which is 5.
2. Find the smallest element among the remaining elements: 4 (at index 6).
3. Swap 5 and 4.
4. The array becomes: [2, 3, 4, 8, 7, 9, 5, 15, 6].

### Continue Steps 4-8

Continue these steps for the rest of the elements in the array, until the entire array is sorted:

### Step 4

Array: [2, 3, 4, 8, 7, 9, 5, 15, 6].

### Step 5

Array: [2, 3, 4, 5, 7, 9, 8, 15, 6].

### Step 6

Array: [2, 3, 4, 5, 6, 9, 8, 15, 7].

### Step 7

Array: [2, 3, 4, 5, 6, 7, 8, 15, 9].

### Step 8

Array: [2, 3, 4, 5, 6, 7, 8, 9, 15].

### Sorted Array

The selection sort algorithm has sorted the array in ascending order: [2, 3, 4, 5, 6, 7, 8, 9, 15].

----

## Complexity Analysis

The selection sort algorithm has the following time and space complexity:

- **Time Complexity**: Selection sort has a time complexity of O(n^2) in the worst-case scenario. This means that its performance degrades significantly as the size of the input array (n) increases. It compares and swaps elements in a quadratic manner.

- **Space Complexity**: Selection sort has a space complexity of O(1) because it performs sorting in-place, without requiring additional memory allocation for data structures like arrays.

It's important to note that while selection sort is simple to implement, it is not the most efficient sorting algorithm, especially for large datasets. For better performance with larger arrays, consider using more efficient sorting algorithms like merge sort or quicksort.
