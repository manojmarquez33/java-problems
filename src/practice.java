import java.util.*;

public class practice{
    public static void main(String[] args) {

        Integer a[] = {104, 210, 315, 166, 441, 180};
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        sortByFactors(list);
    }
    public static void sortByFactors(List<Integer> list){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<list.size();i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }

        Collections.sort(list,(n1,n2)->{

            int num1 = calculateFactor(n1);
            int num2 = calculateFactor(n2);

            if(num1!=num2){
                return num2 - num1;
            }

            return n1 - n2;
        });

        int a[] = new int[list.size()];

        for(int i=0;i<list.size();i++){
            a[i] = list.get(i);
            System.out.print(a[i]+" ");
        }
    }

    static int calculateFactor(int a){
        int count=0;
        for (int i=1;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        return count;
    }
}