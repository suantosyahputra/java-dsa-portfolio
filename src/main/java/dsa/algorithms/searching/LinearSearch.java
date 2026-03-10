package dsa.algorithms.searching;

public class LinearSearch {

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};

        int target = 9;

        int result = search(arr, target);

        if (result != -1) {
            System.out.println("found at index: " + result);
        } else {
            System.out.println("not found");
        }
    }
}