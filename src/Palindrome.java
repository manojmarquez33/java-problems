import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();;
        System.out.println(is_palindrome(n));
    }

    public static String is_palindrome(int n)
    {
        int a = n;
        int rev = 0;
        while(n>0){
            rev = (rev*10) + n%10;
            n/=10;
        }
        if(rev==a)
            return "Yes";
        else
            return "No";
    }
}
