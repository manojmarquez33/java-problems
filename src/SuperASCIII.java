import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperASCIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.next();
        }

        for (int i = 0; i < n; i++) {
            if (isSuper(a[i])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isSuper(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int index = 1; 

        for (char key : map.keySet()) {
            int count = map.get(key);
            if (count != index) {
                return false;
            }
            index++;
        }

        return true;
    }
}
