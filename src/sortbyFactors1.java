import java.util.*;

public class sortbyFactors1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[] = {5, 11, 10, 20, 9, 16, 23};

        sortbyFactors(a);
    }

    public static void sortbyFactors(int a[]){

        List<Integer> list = new ArrayList<>();
        for (int num : a) {
            list.add(num);
        }

        Collections.sort(list, (n1,n2)->{
            int factora = countFactor(n1);
            int factorb = countFactor(n2);

            if(factora != factorb){
                return factorb - factora;
            } else {
                return n1-n2;
            }
        });

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.print(result[i]+" ");
        }
    }

    public static int countFactor(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i==n) count++;
                else count+=2;
            }
        }

        return count;
    }
}
