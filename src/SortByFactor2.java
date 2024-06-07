import java.util.Arrays;

public class SortByFactor2 {

    public static void main(String[] args) {
        int[] arr1 = {5, 11, 10, 20, 9, 16, 23};
        //int[] arr2 = {104, 210, 315, 166, 441, 180};

        System.out.println("Sorted Array 1: " + Arrays.toString(sortByFactors(arr1)));
        //System.out.println("Sorted Array 2: " + Arrays.toString(sortByFactors(arr2)));
    }

    // Custom class to hold the value, number of factors, and original index
    static class Element {
        int value;
        int factors;
        int index;

        Element(int value, int factors, int index) {
            this.value = value;
            this.factors = factors;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Value: " + value + ", Factors: " + factors + ", Index: " + index;
        }
    }

    // Method to calculate the number of factors of a given number
    private static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    // Method to sort the array based on the number of factors
    private static int[] sortByFactors(int[] arr) {
        int n = arr.length;
        Element[] elements = new Element[n];

        // Create Element objects with value, number of factors, and original index
        for (int i = 0; i < n; i++) {
            int factors = countFactors(arr[i]);
            elements[i] = new Element(arr[i], factors, i);
        }

        // Sort elements based on number of factors and then by original index
        Arrays.sort(elements, (e1, e2) -> {
            // Print the elements being compared
            System.out.println("Comparing: " + e1 + " and " + e2);

            if (e1.factors != e2.factors) {
                return e2.factors - e1.factors; // Sort in descending order of factors
            } else {
                return e1.index - e2.index; // Maintain original order if number of factors are the same
            }
        });

        // Extract sorted values
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = elements[i].value;
        }

        return sortedArr;
    }
}
