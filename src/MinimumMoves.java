public class MinimumMoves {
    public static int minimumMoves(String s) {
        int n = s.length();
        int moves = 0;

        for (int i = 0; i < n;) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3;
            } else {
                i++;
            }
        }

        return moves;
    }

    public static void main(String[] args) {

        System.out.println(minimumMoves("XXX")); // Output: 1
        System.out.println(minimumMoves("XXOX")); // Output: 2
        System.out.println(minimumMoves("OOOO")); // Output: 0
        System.out.println(minimumMoves("OXOXOXOXOX")); // Output: 3
        System.out.println(minimumMoves("XXOXOXOX")); // Output: 3
    }
}
