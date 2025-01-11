import java.util.Scanner;

public class PairDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            boolean found = false;

            for (int i = 0; i < n; i++) {
                found = false;
                for (int j = 0; j < n; j++) {
                    if (i != j && a[i] - a[j] == k) {
                        found = true;
                        break;
                    }
                }

            }

            System.out.println(found ? "true" : "false");
        }

        in.close();
    }
}
