import java.util.*;

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

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int num : a){
            if(num%2==0)
                even.add(num);
            else
                odd.add(num);
        }

        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);

        int result[] =  new int[n];
        int index =0;
        for(int o_num : odd)
            result[index++]= o_num;
        for(int e_num :even)
            result[index++]=e_num;

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
