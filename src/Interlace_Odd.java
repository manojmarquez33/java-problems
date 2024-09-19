//import javax.imageio.plugins.tiff.TIFFTag;
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class Interlace_Odd {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
//
//        int[] a = new int[m];
//        int[] b = new int[n];
//        for (int i = 0; i < m; a[i++] = in.nextInt());
//        for (int i = 0; i < n; b[i++] = in.nextInt());
//
//        boolean form = true;
//        int turn = 1;
//        for (int i = 0,j=n-1; i<m && j>=0;) {
//
//            if (turn == 1){
//                if(check1(a[i])){
//                    System.out.print(a[i]+" ");
//                    i++;
//                } else {
//                    i++;
//                    check1(a[i]);
//                }
//            }
//            if(b[j]%2==1) {
//                System.out.print(b[j] + " ");
//            }
//        }
//
//        in.close();
//    }
//    public  static boolean check1(int n,int i,int a[]){
//        if(a[i]%2==1) {
//            return true;
//        }
//        i++;
//        return ;
//    }
//
//    public  static boolean check2(int n){
//        if(n%2==1) {
//            return true;
//        }
//        return false;
//    }
//}
