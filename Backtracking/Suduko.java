public class Suduko {
    public static void main(String[] args) {
        int matrix[][] = { { 0, 0, 0, 2, 6, 0, 7, 0, 1 },
                { 6, 8, 0, 0, 7, 0, 0, 9, 0 },
                { 1, 9, 0, 0, 0, 4, 5, 0, 0 },
                { 8, 2, 0, 1, 0, 0, 0, 4, 0 },
                { 0, 0, 4, 6, 0, 2, 9, 0, 0 },
                { 0, 5, 0, 0, 0, 3, 0, 2, 8 },
                { 0, 0, 9, 3, 0, 0, 0, 7, 4 },
                { 0, 4, 0, 0, 5, 0, 0, 3, 6 },
                { 7, 0, 3, 0, 1, 8, 0, 0, 0 } };

        if (sudukoSolver(matrix, 0, 0)) {
            System.out.println("solution exists");
            printSuduko(matrix);
        } else {
            System.out.println("solution doesnt exist");
        }
    }

    public static void printSuduko(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int matrix[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (matrix[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (matrix[row][j] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (matrix[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean sudukoSolver(int matrix[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int newRow = row, newCol = col + 1;
        if (col + 1 == 9) {
            newRow = row + 1;
            newCol = 0;
            // suduko(matrix, newRow, newCol)
        }

        if (matrix[row][col] != 0) {
            return sudukoSolver(matrix, newRow, newCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(matrix, row, col, digit)) {
                matrix[row][col] = digit;
                if (sudukoSolver(matrix, newRow, newCol)) {
                    return true;
                }
                matrix[row][col] = 0;
            }
        }
        return false;
    }
}