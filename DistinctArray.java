/*Given an array nums of positive integers of size N. Find all distinct digits present in nums.

        Input: nums = [131, 11, 48]
        Output: 1 3 4 8
        Explanation: 1, 3, 4, and 8 are only distinct
        digits that can be extracted from the numbers
        of the array.
 */
import java.util.*;


public class DistinctArray {
    public static void main(String[] args) {
        int a[] = {131, 11, 48};

        int[] result = findDistinctDigits(a);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
    public static int[] findDistinctDigits(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        Set<Integer> distinctDigits = new HashSet<>();
        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                distinctDigits.add(digit);
                num = num / 10;
            }
        }

        int[] result = new int[distinctDigits.size()];
        int index = 0;
        for (int var : distinctDigits) {
            result[index++] = var;
        }
        return result;
    }
}


