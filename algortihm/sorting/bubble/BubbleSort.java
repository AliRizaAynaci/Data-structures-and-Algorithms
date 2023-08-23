package algortihm.sorting.bubble;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);
        // Sorted Array: 2 3 4 5 6 7 8 9 15
        System.out.print("\n" + "Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
