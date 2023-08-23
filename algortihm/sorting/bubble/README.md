## Bubble Sort Algorithm Example

Let's walk through the bubble sort algorithm step by step using the array: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Initial Array

Our unsorted array is: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Step 1

1. Start with the first element (7) and compare it with the second element (3). Since 7 is greater than 3, swap them.
2. The array becomes: [3, 7, 5, 8, 2, 9, 4, 15, 6].

### Step 2

1. Continue comparing and swapping adjacent elements:
    - Compare 7 and 5, swap: [3, 5, 7, 8, 2, 9, 4, 15, 6]
    - Compare 7 and 8, no swap needed.
    - Compare 8 and 2, swap: [3, 5, 7, 2, 8, 9, 4, 15, 6]
    - Compare 8 and 9, no swap needed.
    - Compare 9 and 4, swap: [3, 5, 7, 2, 8, 4, 9, 15, 6]
    - Compare 9 and 15, no swap needed.
    - Compare 15 and 6, swap: [3, 5, 7, 2, 8, 4, 9, 6, 15]

2. After the first pass, the largest element (15) has "bubbled up" to the end of the array.

### Step 3

1. Repeat the same process for the remaining unsorted portion of the array, excluding the last element (15):
    - Compare and swap elements as needed.

2. Continue this process for all elements in the array until the entire array is sorted.

### Sorted Array

The bubble sort algorithm has sorted the array in ascending order: [2, 3, 4, 5, 6, 7, 8, 9, 15].

---

## Complexity Analysis

Bubble sort has the following time and space complexity:

- **Time Complexity**: Bubble sort has a worst-case and average-case time complexity of O(n^2), where 'n' is the number of elements in the array. This makes it inefficient for large datasets. In the best-case scenario (when the list is already sorted), bubble sort has a time complexity of O(n), but this is rare.

- **Space Complexity**: Bubble sort has a space complexity of O(1) because it sorts the array in-place without requiring additional memory allocation for data structures.

Bubble sort is primarily used for educational purposes and not recommended for sorting large datasets efficiently. There are more efficient sorting algorithms like quicksort, mergesort, or heapsort that should be preferred for larger datasets.

