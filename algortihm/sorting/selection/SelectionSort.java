package algortihm.sorting.selection;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

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
        System.out.print("Dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr);

        System.out.print("\n" + "Sirali dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
