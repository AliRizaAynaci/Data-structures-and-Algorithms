## Radix Sort Algorithm Example

Let's walk through the Radix Sort algorithm step by step using the array: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Initial Array

Our unsorted array is: [7, 3, 5, 8, 2, 9, 4, 15, 6].

### Step 1: Least Significant Digit (LSD) Sort

1. Start by sorting the array based on the least significant digit (rightmost digit).
    - [2, 3, 4], [5], [6, 15], [7, 8], [9]

### Step 2: Repeat for Other Digits

2. Continue this process for the tens, hundreds, and so on, until all digits are considered. In this case, we're done.

### Sorted Array

The Radix Sort algorithm has sorted the array in ascending order: [2, 3, 4, 5, 6, 7, 8, 9, 15].

## Radix Sort Algorithm

Radix Sort is a non-comparative sorting algorithm that works by distributing elements into buckets based on their individual digits or characters. It sorts numbers or strings with fixed-size keys by processing the digits or characters from the least significant digit (LSD) to the most significant digit (MSD) or vice versa.

### How Radix Sort Works

1. **Least Significant Digit (LSD) Sort**: Radix Sort starts by sorting the elements based on their least significant digit. It places elements with the same digit in the same bucket. After this pass, the array is partially sorted based on the least significant digit.

2. **Repeat for Other Digits**: Radix Sort then repeats the process for the tens, hundreds, and so on, until all digits have been considered. Each pass distributes elements into buckets based on the value of the digit at the current position.

3. **Combine Buckets**: After processing all digits, the elements are combined back into a single array in the order determined by the digits' values.

### Complexity Analysis

- **Time Complexity**: Radix Sort has a time complexity of O(n * k) in the worst-case scenario, where 'n' is the number of elements in the array, and 'k' is the number of digits in the maximum number or the key size. It performs linear time sorting based on the size of the input.

- **Space Complexity**: Radix Sort has a space complexity of O(n + k) because it uses additional space for counting and output arrays.

Radix Sort is particularly efficient when dealing with numbers or strings of fixed-size keys and is stable (keeps the relative order of equal elements). It is commonly used in scenarios where input data has a limited range of values and a fixed number of digits.
