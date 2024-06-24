
import java.util.Arrays;

public class SortByFreqArray {

    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5, 4, 6, 4, 4};
        int res[] = sortByFrequency(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] sortByFrequency(int[] arr) {
        int n = arr.length;

        // Create a 2D array to store element and its frequency
        // Since Ai ranges from 1 to 60, we use an array of size 61
        // index 0 will not be used, indices 1 to 60 will be used
        int[][] frequencyMatrix = new int[61][2]; // [element][0] = frequency, [element][1] = element

        // Count frequencies
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            frequencyMatrix[element][0]++; // Increment frequency
            frequencyMatrix[element][1] = element; // Store the element
        }

        // Sort by frequency descending, and by element value ascending if frequencies are the same
        Arrays.sort(frequencyMatrix, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(b[0], a[0]); // Sort by frequency descending
            } else {
                return Integer.compare(a[1], b[1]); // Sort by element value ascending
            }
        });

        // Create the sorted array based on the sorted frequency matrix
        int[] sortedArray = new int[n];
        int index = 0;
        for (int i = 1; i <= 60; i++) {
            int frequency = frequencyMatrix[i][0];
            int element = frequencyMatrix[i][1];
            while (frequency > 0) {
                sortedArray[index++] = element;
                frequency--;
            }
        }

        return sortedArray;
    }
}
