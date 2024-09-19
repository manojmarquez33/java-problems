import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        int repeat =0; //a4b12c7
        char result=' ' ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>'9'){
                sb.append(String.valueOf(result).repeat(repeat));
                result= c;
                repeat=0;
            } else {
                repeat = repeat*10;
                repeat =  repeat+((int)c - 48);
            }
        }
        sb.append(String.valueOf(result).repeat(repeat));

        System.out.println(sb);
    }
}
