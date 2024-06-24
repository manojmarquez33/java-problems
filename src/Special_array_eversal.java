class Special_array_eversal {
    public static String reverse(String str) {
        char[] a = str.toCharArray();
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (!Character.isAlphabetic(a[i])) {
                i++;
                continue;
            }

            if (!Character.isAlphabetic(a[j])) {
                j--;
                continue;
            }

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        return new String(a);
    }

    public static void main(String[] args) {
        String str1 = "A&B";
        System.out.println(reverse(str1));  // Output: "B&A"

        String str2 = "A&x#";
        System.out.println(reverse(str2));  // Output: "x&A#"
    }
}
