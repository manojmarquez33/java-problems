import java.util.Scanner;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            System.out.println(findExtra(n, a, b));
        }
        sc.close();
    }

    public static int findExtra(int n, int arr1[], int arr2[]) {
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }
        return n - 1;
    }
}

