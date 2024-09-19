import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.nextLine().toUpperCase();
        String b = in.nextLine().toUpperCase();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(c>=65 && c<=97) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        map.forEach((key, value) -> System.out.println(key + " = " + value));

        for(int i=0;i<b.length();i++){
            char c = b.charAt(i);
            if(c>=65 && c<=97) {
                map.put(c, map.getOrDefault(c,0) - 1);
                if(map.get(c)==0) {
                    map.remove(c);
                }
            }

        }
        System.out.println(map.isEmpty()? "Anagram" : "Not Anagram");
    }
}
