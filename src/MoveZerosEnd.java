/**
 * Given an array arr[] of n positive integers. Push all the zeros of the given array to
 * the right end of the array while maintaining the order of non-zero elements.
 * Do the mentioned change in the array in-place
 * */
public class MoveZerosEnd {
    public static void main(String[] args) {

        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Original array:");
        printArray(arr);

        pushZerosToEnd(arr, arr.length);

        System.out.println("Array after pushing zeros to the end:");
        printArray(arr);
    }

     static void pushZerosToEnd(int[] arr, int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
