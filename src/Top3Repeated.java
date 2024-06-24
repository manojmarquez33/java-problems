
import java.util.Arrays;

public class Top3Repeated {

    static class Element {
        int value;
        int frequency;
        int firstIndex;

        Element(int value, int frequency, int firstIndex) {
            this.value = value;
            this.frequency = frequency;
            this.firstIndex = firstIndex;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5};
        int[] res = findTopThreeRepeatedNumbers(arr);

        System.out.println("Top three repeated numbers:");
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] findTopThreeRepeatedNumbers(int[] arr) {
        int n = arr.length;

        int[] frequency = new int[61]; // index 0 to 60

        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        Element[] elements = new Element[61];
        for (int i = 0; i <= 60; i++) {
            if (frequency[i] > 0) {
                elements[i] = new Element(i, frequency[i], -1); // Initialize with -1 for first index
            }
        }

        // Update first occurrence index in Element array
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            if (elements[value].firstIndex == -1) {
                elements[value].firstIndex = i;
            }
        }

        // Sort elements by frequency descending, and by first index ascending if frequencies are the same
        Arrays.sort(elements, (e1, e2) -> {
            if (e1 == null && e2 == null) {
                return 0;
            } else if (e1 == null) {
                return 1;
            } else if (e2 == null) {
                return -1;
            } else {
                if (e1.frequency != e2.frequency) {
                    return e2.frequency - e1.frequency; // Sort by frequency descending
                } else {
                    return e1.firstIndex - e2.firstIndex; // Sort by first index ascending
                }
            }
        });

        // Extract top three elements
        int[] topThree = new int[3];
        int count = 0;
        for (int i = 0; i <= 60 && count < 3; i++) {
            if (elements[i] != null) {
                topThree[count++] = elements[i].value;
            }
        }

        return topThree;
    }
}
