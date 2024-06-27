import java.util.ArrayList;
import java.util.Scanner;

public class DiffDataList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Object> list = new ArrayList<>();
        list.add("mano");
        list.add(9);

        int n = in.nextInt();
        in.nextLine();
        for (int i=0;i<n;i++){
            if(in.hasNextInt())
                list.add((in.nextInt()));
            else
                list.add(in.nextLine());
        }
        System.out.println(list);
        System.out.println("________________________________________");
        for(Object obj : list)
            System.out.print(obj+" ");
    }
}
