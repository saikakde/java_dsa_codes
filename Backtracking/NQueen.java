public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        // up
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // daigonal leftup
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonal rightup
        for(int i=row,j=col;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][], int row) {
        // System.out.println("------------------");
        if (row == board.length) {
            // System.out.println()
            printBoard(board);
            // System.out.println();
            System.out.println("------------------");
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)){

                board[row][j] = 'Q';
                // printBoard(board);
                // System.out.println();
                
                nQueen(board, row + 1);
                board[row][j] = 'X';
                // printBoard(board);
                // System.out.println();
            }

        }
    }
}
