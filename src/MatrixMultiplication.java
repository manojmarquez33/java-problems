import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];
        System.out.println("Enter M1 :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter M2 :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m2[i][j] = in.nextInt();
            }
        }

        int r[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
//                    System.out.print(j+"j value" +"");
//                    System.out.print(k+"k value" +"");
                    r[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        for (int i =0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}
