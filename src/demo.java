//A tank has a x lt of water and a bucket can able to get y lt of water. Each person require exactly
// 2 bucket of water.
//Find the max no of people able to get water from the tank.

import java.util.Scanner;

//p : x  y
//Ip 1: 10 6
//Op: 0
//
//Ip 2 : 100 10
//Op : 5
public  class demo  {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();

        calculate(10,6);
        calculate(100,10);
        calculate(12,6);
        calculate(18,4);
    }

    public static void calculate(int x , int y){
        System.out.println(x+" "+y);
        System.out.println((2*y)>x ? 0 :x/(2*y));
    }
}
