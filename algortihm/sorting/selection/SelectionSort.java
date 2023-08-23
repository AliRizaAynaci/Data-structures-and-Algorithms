package algortihm.sorting.selection;

public class SelectionSort {

    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = arr[n - 1];
            int index = n - 1;

            for (int j = i; j < (n - 1); j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        int n = arr.length;

        System.out.print("Unsorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr, n);

        // Sorted Array: 2 3 4 5 6 7 8 9 15
        System.out.print("\n" + "Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
