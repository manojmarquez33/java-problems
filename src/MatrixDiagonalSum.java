class MatrixDiagonalSum {
    public static void main(String[] args) {
        // Example 1
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Sum of diagonals: " + diagonalSum(mat1));
        System.out.println("Sum of diagonals: " + diagonalSum1(mat1));
        int[][] mat2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println("Sum of diagonals: " + diagonalSum(mat2));
        System.out.println("Sum of diagonals: " + diagonalSum1(mat2));

        int[][] mat3 = {
                {5}
        };
        System.out.println("Sum of diagonals: " + diagonalSum(mat3));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static int diagonalSum1(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if(mat[0].length%2==1) sum -= mat[n / 2][n/2];

        return sum;
    }
}
