import java.util.*;

public class SortByFreqArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,5, 5, 4, 6, 4, 5, 5, 5, 5};
        int[] res = sortByFrequency(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    static int[] sortByFrequency(int[] arr) {
        int n = arr.length;
        int[][] freqArray = new int[61][2];

        for (int i = 0; i < 61; i++) {
            freqArray[i][0] = i;
            freqArray[i][1] = 0;
        }

        for (int value : arr) {
            freqArray[value][1]++;
        }

        Arrays.sort(freqArray, (a, b) -> {
            if (b[1] != a[1]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });

        int[] sortedArray = new int[n];
        int index = 0;

        for (int i = 0; i < 61; i++) {
            int value = freqArray[i][0];
            int frequency = freqArray[i][1];

            for (int j = 0; j < frequency; j++) {
                sortedArray[index++] = value;
            }
        }

        return sortedArray;
    }
}
