import java.util.Scanner;

/*
Given a number N, the task is to print the prime numbers from 1 to N.
Examples:

Input: N = 10
Output: 2, 3, 5, 7
Input: N = 5
Output: 2, 3, 5
* */
public class N_PrimeNumber {
    static boolean findPrime(int n){
        if(n==0 || n==1) return false;
        int count=0;
            for (int i = 2; i < n/2; i++) {
                count++;
                if (n % i == 0) return false;
            }
            return true;

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
            if(findPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
