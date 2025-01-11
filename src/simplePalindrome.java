import java.util.Scanner;

public class simplePalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        boolean palim = true;
        int n = a.length()-1;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(n-i)){
                palim = false;
                break;
            }
        }

        System.out.println(palim ? true : false);
    }
}
