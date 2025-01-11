import java.util.Scanner;

/*
* Given an amount, find the minimum number of notes of different denominations that sum up to the given amount.
* Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount.
We may assume that we have infinite supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1}
Examples:
Input : 800
Output : Currency  Count
         500 : 1
         200 : 1
         100 : 1
Input : 2456
Output : Currency  Count
         2000 : 1
         200 : 2
         50 : 1
         5 : 1
         1 : 1
* *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cash[] = {2000,500,200,100,50,20,10,5,1};
        int notes[] =  new int[9]; // 2048
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=0;i<9;i++){
            if(n >= cash[i]){
                notes[i] = n / cash[i];
                 n = n % cash[i];
            }
        }

        for(int i=0;i<9;i++){
            if(notes[i]!=0)
            System.out.println(cash[i]+" : "+notes[i]);
        }

    }
}