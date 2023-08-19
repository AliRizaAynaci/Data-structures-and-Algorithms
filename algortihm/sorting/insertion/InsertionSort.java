package algortihm.sorting.insertion;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutu: ");
        int n = scanner.nextInt();

        int[] arr= new int[n];

        System.out.println("Dizi elemanlarini girin: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Dizi elemani " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

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
