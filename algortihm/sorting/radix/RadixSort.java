package algortihm.sorting.radix;

import java.util.Arrays;

public class RadixSort {

    // A utility function to get the maximum value in the array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // A function to do counting sort of arr[] based on the digit represented by exp.
    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Initialize count array
        Arrays.fill(count, 0);

        // Store the of occurrences int count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] /exp) % 10]++;
        }

        // Change count[i] so that count[i] contains the actual
        // Position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        System.arraycopy(output, 0, arr, 0, n);
    }

    // The main function to sort an array of integers using RadixSort
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed
        // exp is 10^i where i is the current digit number
        for (int exp = 1; max /exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }


    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        int n = arr.length;
        System.out.print("Unsorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        radixSort(arr);

        // Sorted Array: 2 3 4 5 6 7 8 9 15
        System.out.print("\n" + "Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
