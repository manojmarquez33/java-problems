public class MissingNumber {

    public static int missingNumber(int n, int arr[]) {

        int sum = (n * (n + 1)) / 2;
        int arrsum = 0;
        for (int num : arr) {
            arrsum += num;
        }
        return sum - arrsum;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 5}; 
        int missing = missingNumber(n, arr);
        System.out.println("The missing number is: " + missing);
    }
}
