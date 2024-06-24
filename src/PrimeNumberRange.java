import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=start;i<end;i++){
            if(findPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean findPrime(int n){
        if(n<=1) return false;
        if(n==2) return  true;
        if(n%2==0) return false;

        for (int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
