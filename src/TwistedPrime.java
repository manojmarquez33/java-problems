import java.io.*;
import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.print("Enter a number: ");
            int N = in.nextInt();
            Solution ob = new Solution();
            int result = ob.isTwistedPrime(N);
            if (result == 1) {
                System.out.println(N + " is a twisted prime.");
            } else {
                System.out.println(N + " is not a twisted prime.");
            }
        }
    }
}

class Solution {
    int isTwistedPrime(int n) {
        if (prime(n) && prime(reverse(n))) return 1; else return 0;
    }

    boolean prime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        return rev;
    }
}
