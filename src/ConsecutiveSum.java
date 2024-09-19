import java.util.Scanner;

public class ConsecutiveSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
        for(int i=1;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=j;
                if(sum==n){
                    count++;
                    break;
                }
                if(sum>15) {
                    break;
                };
            }
        }

        System.out.println(count);
    }
}
