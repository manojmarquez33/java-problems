/**Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

 Input:
 The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

 Output:
 For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.
 Constraints:
 1 ≤ T ≤ 70
 1 ≤ N ≤ 130
 1 ≤ Ai ≤ 60

 Example:
 Input:
 2
 5
 5 5 4 6 4
 5
 9 9 9 2 5

 Output:
 4 4 5 5 6
 9 9 9 2 5
        */
import java.util.*;

public class SortByFrequency2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = in.nextInt();
            }
            int[] sortedArray = sortByFrequency(array);
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA; // Descending order of frequency
            } else {
                return a - b; // Ascending order of value
            }
        });

        int[] result = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
