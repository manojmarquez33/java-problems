import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAcuurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size ");
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter list elements :");
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Enter X :");
        int X = scanner.nextInt();
        list.removeIf(n -> n == X);
        System.out.println(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
