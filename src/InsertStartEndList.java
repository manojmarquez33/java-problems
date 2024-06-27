import java.util.ArrayList;
import java.util.Scanner;

public class InsertStartEndList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        int X = scanner.nextInt();
        list.addFirst(X);
        list.add(X);
        for (Object num : list) {
            System.out.print(num + " ");
        }
    }
}
