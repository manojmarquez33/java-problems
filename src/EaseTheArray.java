/**Given an array of integers of size, N. Assume ‘0’ as the invalid number and
 * all others as a valid number. Write a program that modifies the array in such
 * a way that if the next number is a valid number and is the same as the current number,
 * double the current number value and replace the next number with 0. After the modification
 * , rearrange the array such that all 0’s are shifted to the end and the sequence of the
 * valid number or new doubled number is maintained as in the original array.

 Example 1:

 â€‹Input : arr[ ] = {2, 2, 0, 4, 0, 8}
 Output : 4 4 8 0 0 0
 Explanation:
 At index 0 and 1 both the elements are same.
 So, we can change the element at index 0 to
 4 and element at index 1 is 0 then we shift
 all the values to the end of the array.
 So, array will become [4, 4, 8, 0, 0, 0].*/
public class EaseTheArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 4, 0, 8};

        System.out.println("Original array:");
        printArray(arr);

        modifyAndRearrangeArr(arr, arr.length);

        System.out.println("Array after modification and rearrangement:");
        printArray(arr);
    }

    static void modifyAndRearrangeArr(int arr[], int n) {
        int zero = n - 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        while (count < n)
            arr[count++] = 0;
    }
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


/**
 * ### Time Complexity:
 *
 * 1. **First Loop** (`for (int i = 0; i < n - 1; i++)`):
 *    - This loop runs from `i = 0` to `i = n - 2`, performing a constant amount of work for each iteration.
 *    - **Time Complexity**: \( O(n) \)
 *
 * 2. **Second Loop** (`for (int i = 0; i < n; i++)`):
 *    - This loop runs from `i = 0` to `i = n - 1`, performing a constant amount of work for each iteration.
 *    - **Time Complexity**: \( O(n) \)
 *
 * 3. **Third Loop** (`while (count < n)`):
 *    - This loop runs from `count` to `n - 1`, performing a constant amount of work for each iteration. The number of iterations depends on how many zeros were encountered in the previous loops, but in the worst case, it also runs for `n` iterations.
 *    - **Time Complexity**: \( O(n) \)
 *
 * Combining these, the total time complexity is:
 * \[ O(n) + O(n) + O(n) = O(n) \]
 *
 * ### Space Complexity:
 *
 * - The space complexity of this algorithm is determined by the additional space used.
 * - Here, we are only using a few integer variables (`zero` and `count`), which require \( O(1) \) space.
 * - No additional data structures are used that grow with the input size.
 *
 * Therefore, the space complexity is:
 * \[ O(1) \]
 *
 * ### Summary:
 *
 * - **Time Complexity**: \( O(n) \)
 * - **Space Complexity**: \( O(1) \)*/