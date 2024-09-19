import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SmallestProductTCS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if(x<=1){
            System.out.println(-1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=9;i>=2;i--) {
            if (x % i == 0) {
                list.add(i);
                x/=i;
            }
        }

        if(x!=1){
            System.out.println(-1);
        }

        Collections.sort(list);
        System.out.println(list);

        for (int d : list){
            System.out.print(d);
        }
    }
}
