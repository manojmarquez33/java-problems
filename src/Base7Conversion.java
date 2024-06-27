public class Base7Conversion {

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));   // Output: "202"
        System.out.println(convertToBase7(-7));    // Output: "-10"
        System.out.println(convertToBase7(0));     // Output: "0"
        System.out.println(convertToBase7(7));     // Output: "10"
        System.out.println(convertToBase7(-100));  // Output: "-202"
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (negative) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}
