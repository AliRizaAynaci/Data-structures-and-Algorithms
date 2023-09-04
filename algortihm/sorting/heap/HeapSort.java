package algortihm.sorting.heap;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root (max element) to the end of the array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize the largest element as the root
        int leftChild = 2 * i + 1; // Left Child
        int rightChild = 2 * i + 2; // Right Child

        // If the left child is larger than the root
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // If the right child is larger than the largest so far
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If the largest element is not the root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }

    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        int n = arr.length;
        System.out.print("Unsorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        heapSort(arr);

        // Sorted Array: 2 3 4 5 6 7 8 9 15
        System.out.print("\n" + "Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
