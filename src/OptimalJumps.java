import java.util.Scanner;

/**
 * Optimum Jumps. You are given an array A of N integers. You have to find the minimum cost that is required to cross the array by jumping from one element to another. You need to start from the first element of the array and you can jump in both directions, but the length of the forwarding jump must be two andlength of the backward jump must be one.
 *
 * The cost of forwarding and backward jump is the value of the element from which you are jumping, that is, the cost of jumping from ith Index to (i+2)th and the cost of jumping from ith Index to (i-1)th Index is the value of ith Element of the array A.
 *
 * If you are at the last element of the array then you can jump out of the array and cost of that jump will be the value of the last element of array A.
 *
 * Input format:
 *
 * First     line: N(size of the array)
 * Second line: N space seperated integers of the array.
 * Output format:
 *
 * Print the cost in a single line.
 * Constraints:
 *
 * 1<=N<=105
 * 1 <= A[i] <= 109
 * Input: 5
 *        1 2 3 4 100
 * Output: 10
 * Explanation:
 *
 * The cost of the forward jump from 1st Element to 3rd Element is 1.
 * The cost of the backward jump from 3rd Element to 2nd Element is 3.
 * The cost of the forward jump from 2nd Element to 4th Element is 2.
 * The cost of the forward jump from 4th Element to out of the array is 4.
 * Total cost = 1 + 3 + 2 + 4 = 10*/
import java.util.Scanner;

public class OptimalJumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // Read the size of the array
        int[] a = new int[n]; // Initialize the array

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt(); // Read the elements of the array
        }

        // Handle edge cases
        if (n == 1) {
            System.out.println(a[0]); // If there's only one element, print it as the cost
            return;
        } else if (n == 2) {
            // If there are only two elements, you can jump directly out after reaching the second element
            System.out.println(a[0] + a[1]);
            return;
        }

        // Start calculating the total cost from the first element
        long totalCost = 0; // The first jump cost is the value of the first element
        int i = 0; // Start from the first index (i = 0)

        // Greedily find the minimum cost until we reach the last element
        while (i < n - 1) {
            if (i + 2 < n) {
                // If we can jump forward two steps, compare the cost of forward and backward jumps
                if (a[i + 2] < a[i + 1]) {
                    totalCost += a[i]; // Add the cost of the forward jump
                    i += 2; // Move forward by two steps
                } else {
                    totalCost += a[i]; // Add the cost of the backward jump
                    i += 1; // Move forward by one step (as it's better to move one step)
                }
            } else {
                // If we are near the end, just jump forward to the last element or out of the array
                totalCost += a[i];
                i = n - 1; // Move to the last element
            }
        }

        // Add the cost of jumping out of the array (which is the value of the last element)
        //totalCost += a[n - 1];

        System.out.println(totalCost); // Output the total cost
    }
}

