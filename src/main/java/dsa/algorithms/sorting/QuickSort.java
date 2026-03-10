package dsa.algorithms.sorting;

public class QuickSort {

    public static void sort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {

        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {9, 4, 8, 3, 1, 2, 5};

        System.out.print("before: ");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.print("after: ");
        printArray(arr);
    }
}