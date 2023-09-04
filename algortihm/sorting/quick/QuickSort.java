package algortihm.sorting.quick;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            // Partition the array into two sub-arrays
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // Choose the pivot element
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (the pivot element)\
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        int n = arr.length;
        System.out.print("Unsorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        // Sorted Array: 2 3 4 5 6 7 8 9 15
        System.out.print("\n" + "Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



