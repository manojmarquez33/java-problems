class MaxSubArray {
    static long maxSubarraySum(int arr[], int n) {
        long curSum = 0;
        long maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long temp = curSum + arr[i];
            if (temp < arr[i]) {
                curSum = arr[i];
            } else {
                curSum = temp;
            }

            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -2, 5};
        int n1 = arr1.length;
        System.out.println(maxSubarraySum(arr1, n1));

        int[] arr2 = {-1, -2, -3, -4};
        int n2 = arr2.length;
        System.out.println(maxSubarraySum(arr2, n2));
    }
}
