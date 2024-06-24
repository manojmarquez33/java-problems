/**
 * Given an array arr of n non-negative numbers. The task is to find the first equilibrium point in an array. The equilibrium point in an array is an index (or position) such that the sum of all elements before that index is the same as the sum of elements after it.
 *
 * Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
 *
 * Examples:
 *
 * Input: n = 5, arr[] = {1,3,5,2,2}
 * Output: 3
 * Explanation: The equilibrium point is at position 3 as the sum of elements before it (1+3) = sum of elements after it (2+2).
 * Input: n = 1, arr[] = {1}
 * Output: 1
 * Explanation: Since there's only one element hence it's only the equilibrium point
 * */
public class EquilibriumPoint {

    public static int findEquilibrium(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }

        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        long leftSum = 0;
        long rightSum = totalSum;

        for (int i = 0; i < n; i++) {
            rightSum -= arr[i];

            if (leftSum == rightSum) {
                return i + 1;
            }

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 2, 2};
        System.out.println(findEquilibrium(arr1)); // Output: 3

        int[] arr2 = {1};
        System.out.println(findEquilibrium(arr2)); // Output: 1

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(findEquilibrium(arr3)); // Output: -1
    }
}

