import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = in.nextInt();

        pattern18(n);
    }

    public static void pattern1(int n){
         /*Input: N = 6
            Output:
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        /*Input Format: N = 6
        Result:
*
* *
* * *
* * * *
* * * * *
* * * * * **/
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        /* Enter N value : 6
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
            */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
}
    public static void pattern4(int n){
        /*Enter N value : 6
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
       /* Enter N value : 6
                * * * * * *
                * * * * *
                * * * *
                * * *
                * *
                *
              */
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        /*
        Enter N value : 5
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
//        Enter N value : 5
//                *
//               ***
//              *****
//             *******
//            *********

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
//        Enter N value : 5
//                *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        /*Enter N value : 5

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
**/
        for(int i=0;i<2*n;i++){
            int start = i;
            if(i>n) start = 2*n-i;
            for(int j=0;j<start;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        System.out.println("-------------------");
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
    public static void pattern11(int n){
         /*Enter N value : 5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
        int start = 0;
        for(int i=0;i<n;i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start =  1 - start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
//        Enter N value : 5
//        1-------1
//        12-----21
//        123---321
//        1234-4321
//        1234554321
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
//        Enter N value : 5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
       /* Enter N value : 5
        A
        A B
        A B C
        A B C D
        A B C D E*/
        for(int i=1;i<=n;i++){
            int count = 65;
            for(int j=1;j<=i;j++){
                System.out.print((char)count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        /*Enter N value : 5
        A B C D E
        A B C D
        A B C
        A B
        A*/
        for(int i=1;i<=n;i++){
            int count = 65;
            for(int j=1;j<=n-i+1;j++){
                System.out.print((char)count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        /*Enter N value : 5
        A
        B B
        C C C
        D D D D
        E E E E E*/
        int count = 65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)count+" ");
            }
           count = count+1;
            System.out.println();
        }
    }
    public static void pattern17(int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                System.out.print("-");
            }
            int count = 65;
            int point = (2*i+1)/2;
            for(int j=1;j<=(2*i+1);j++){
                System.out.print((char)count);
                if(j<=point){
                    count++;
                }else count--;

            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print("-");
            }

            System.out.println();
        }
    }
    public static void pattern18(int n){

        for(int i=0;i<n;i++){
            int alpha = 64+n;
            for(int j=0;j<=i;j++){
                System.out.print((char) (alpha-i+j)+" ");
            }
            System.out.println();
        }
    }
    }
