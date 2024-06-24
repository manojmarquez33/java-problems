public class ReverseStringSpecial {

    public static void main(String[] args) {
        String S = "A&B";
        System.out.println(reverseString(S));

        String S2 = "A&x#";
        System.out.println(reverseString(S2));
    }

    public static String reverseString(String S) {
        char[] arr = S.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!Character.isAlphabetic(arr[i])) {
                i++;
                continue;
            }

            if (!Character.isAlphabetic(arr[j])) {
                j--;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }
}
