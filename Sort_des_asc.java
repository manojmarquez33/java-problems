import java.util.Arrays;

/*Given an array A of positive integers. Your task is to sort them in such
a way that the first part of the array contains odd numbers sorted in descending
order, rest portion contains even numbers sorted in ascending order
Input:
N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:
7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd
and sorted in descending order,
whereas 2 4 10 are even numbers
and sorted in ascending order.
 */

public class Sort_des_asc {
    static int[] sortArray(int n,int a[]){
        int min = Arrays.stream(a).min().getAsInt();
        int result[] =  new int[n];
        result[n/2] = min;
        for(int i=0;i<n;i++) {
            if (a[i] % 2==0){
                result[min+1+i] = a[i];
            }else {
                result[min-1-i] = a[i];
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int n = 7;
        int a[] = {1, 2, 3, 5, 4, 7, 10};
        int result[] =  sortArray(n,a);
        for (int var : result)
            System.out.print(var+" ");
    }
}
