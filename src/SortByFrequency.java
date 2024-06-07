/**Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

 Input:
 The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

 Output:
 For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.

 Constraints:
 1 ≤ T ≤ 70
 1 ≤ N ≤ 130
 1 ≤ Ai ≤ 60

 Example:
 Input:
 2
 5
 5 5 4 6 4
 5
 9 9 9 2 5

 Output:
 4 4 5 5 6
 9 9 9 2 5*/
import java.util.Arrays;

class SortByFrequency{
    public static void main(String[] args) {
        int arr[] = {5,5,5,5,4,6,4,4};
        int res[]=sortByFrequency(arr);
        for(int i : res){
            System.out.print(i);
        }
    }

    static class Elements{
        int value;
        int factor;
        int index;

        Elements(int value,int factor,int index){
            this.value = value;
            this.factor = factor;
            this.index = index;
        }
    }

    static int[] sortByFrequency(int arr[]){
        int n = arr.length;
        Elements[] elements = new Elements[n];

        for(int i=0; i<n; i++) {
            int factor = countFrequency(arr[i], arr);
            elements[i] = new Elements(arr[i], factor, i);
        }

        Arrays.sort(elements, (e1, e2) -> {
            if (e1.factor != e2.factor)
                return e2.factor - e1.factor;
            else
                return e1.value - e2.value;
        });

        int sortArray[] = new int[n];
        for(int i=0; i<n; i++){
            sortArray[i] = elements[i].value;
        }
        return sortArray;
    }

    static int countFrequency(int num, int arr[]){
        int n = arr.length, freq = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == num)
                freq++;
        }
        return freq;
    }
}
