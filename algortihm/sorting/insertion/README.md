## Insertion Sort Algorithm Example

Let's walk through the insertion sort algorithm step by step using the array: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Initial Array

Our unsorted array is: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Step 1

1. Start with the second element, which is 3.
2. Compare it with the first element, 7. Since 3 is smaller, swap them.
3. The array now looks like this: [3, 7, 5, 8, 2, 9, 4, 15, 6].

### Step 2

1. Move to the third element, which is 5.
2. Compare it with the elements before it (7 and 3). Insert 5 at the correct position.
3. The array becomes: [3, 5, 7, 8, 2, 9, 4, 15, 6].

### Step 3

1. Move to the fourth element, which is 8.
2. Compare it with the elements before it (7, 5, and 3). Insert 8 at the correct position.
3. The array becomes: [3, 5, 7, 8, 2, 9, 4, 15, 6].

### Continue Steps 4-9

Continue these steps for the rest of the elements in the array, until the entire array is sorted:

### Step 4

Array: [2, 3, 5, 7, 8, 9, 4, 15, 6].

### Step 5

Array: [2, 3, 4, 5, 7, 8, 9, 15, 6].

### Step 6

Array: [2, 3, 4, 5, 6, 7, 8, 9, 15].

### Sorted Array

The insertion sort algorithm has sorted the array in ascending order: [2, 3, 4, 5, 6, 7, 8, 9, 15].

----

## Complexity Analysis

Insertion sort has the following time and space complexity:

- **Time Complexity**: In the average and worst-case scenarios, insertion sort has a time complexity of O(n^2), making it less efficient than some other sorting algorithms for large datasets. However, for small arrays or nearly sorted data, it can be faster due to its simplicity.

- **Space Complexity**: Insertion sort has a space complexity of O(1) because it sorts the array in-place without requiring additional memory allocation for data structures.

It's important to note that insertion sort is efficient for small datasets or partially sorted data, but for larger datasets, more efficient sorting algorithms like merge sort or quicksort are often preferred.

### Stability

Insertion sort is stable, meaning that it preserves the relative order of equal elements in the sorted array. This can be an important feature in certain applications.
