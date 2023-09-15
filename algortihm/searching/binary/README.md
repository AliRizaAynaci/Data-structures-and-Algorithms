# Binary Search Algorithm

Binary search is a widely-used search algorithm that efficiently finds a specific element in a sorted array or list. It is a "divide and conquer" algorithm that repeatedly divides the search space in half, reducing the search range by half in each iteration until the target element is found or the search range becomes empty.

## Algorithm Overview

The binary search algorithm works as follows:

1. Initialize two pointers, `left` and `right`, to the first and last indices of the array, respectively.

2. While `left` is less than or equal to `right`, repeat the following steps:
    - Calculate the middle index as `mid` using the formula `mid = left + (right - left) / 2`.
    - Compare the element at the `mid` index with the target element.
    - If they are equal, the target element is found, and the index is returned.
    - If the element at `mid` is less than the target, update `left` to `mid + 1` to search the right half of the array.
    - If the element at `mid` is greater than the target, update `right` to `mid - 1` to search the left half of the array.

3. If the loop exits without finding the target element, return `-1` to indicate that the element is not present in the array.

## Time Complexity

Binary search is highly efficient, with a time complexity of O(log n), where n is the number of elements in the array. This makes it particularly useful for large datasets.
