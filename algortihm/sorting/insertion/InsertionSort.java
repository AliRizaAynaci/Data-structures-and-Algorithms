package algortihm.sorting.insertion;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        System.out.print("Dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.print("\n" + "Sirali dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
