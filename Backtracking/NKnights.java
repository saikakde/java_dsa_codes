public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nKnights(board, 0);
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        int[][] moves = {
                { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 },
                { 1, -2 }, { 1, 2 }, { 2, -1 }, { 2, 1 }
        };

        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (newRow >= 0 && newRow < board.length &&
                    newCol >= 0 && newCol < board.length &&
                    board[newRow][newCol] == 'K') {
                return false;
            }
        }
        return true;
    }

    public static void nKnights(char board[][], int row) {
        if (row == board.length) {
            // System.out.println()
            printBoard(board);
            // System.out.println();
            System.out.println("------------------");
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {

                board[row][j] = 'K';

                nKnights(board, row + 1);
                board[row][j] = 'X';

            }

        }
    }
}
