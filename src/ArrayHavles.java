import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayHalves {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        //int t = in.nextInt();
        //while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                int maxA = max(a, n);
                int minB = min(b, n);

                if (minB > maxA) {
                    int indexMaxA = indexOf(maxA, n, a);
                    int indexMinB = indexOf(minB, n, b);

                    int temp = a[indexMaxA];
                    a[indexMaxA] = b[indexMinB];
                    b[indexMinB] = temp;

                    count++;
                }
            }

            System.out.println(count);
        //}
        in.close();
    }

    public static int max(int a[], int n) {
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max1 = a[i];
            }
        }
        return max1;
    }

    public static int min(int a[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int indexOf(int val, int n, int a[]) {
        for (int i = 0; i < n; i++) {
            if (a[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
