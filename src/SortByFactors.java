import java.util.Arrays;
import java.util.Comparator;

public class SortByFactors {

    public static void main(String[] args) {
        int[] arr1 = {5, 11, 10, 20, 9, 16, 23};
        int[] arr2 = {104, 210, 315, 166, 441, 180};

        System.out.println("Sorted Array 1: " + Arrays.toString(sortByFactors(arr1)));
        System.out.println("Sorted Array 2: " + Arrays.toString(sortByFactors(arr2)));
    }

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

    /**
     * Consider the array {5, 11, 10, 20, 9, 16, 23}:
     *
     * Factors of 20 = 6
     * Factors of 16 = 5
     * Factors of 10 = 4
     * Factors of 9 = 3
     * Factors of 5, 11, 23 = 2 each
     * When comparing:
     *
     * 20 and 16 (factorsB - factorsA = 5 - 6 = -1), since 20 has more factors than 16, 20 should come before 16.
     * 16 and 10 (factorsB - factorsA = 4 - 5 = -1), since 16 has more factors than 10, 16 should come before 10.*/

    private static int[] sortByFactors(int[] arr) {
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Custom comparator to sort based on number of factors and original index
        Arrays.sort(boxedArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int factorsA = countFactors(a);
                int factorsB = countFactors(b);
                return factorsB - factorsA; // Sort in descending order of factors
            }
        });

        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }
}
