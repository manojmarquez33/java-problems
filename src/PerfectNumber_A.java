import java.util.Scanner;

public class PerfectNumber_A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int stop = in.nextInt();
        int sum = 0;
        for(int i=start;i<=stop;i++){
            if(perfectCheck(i)){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println("sum :"+sum);
    }

    public static boolean perfectCheck(int n){

        if (String.valueOf(n).contains("0")) {
            return false;
        }

        int original = n; //432
        int rem;
        while(n>0){
            rem =  n%10;
            if(original%rem!=0){
                return false;
            }
            n/=10;
        }

        return true;
    }
}
