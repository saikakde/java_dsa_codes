public class NRook {
        public static void main(String[] args) {
            int n = 3;
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
                if(board[i][col]=='R'){
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
    
                    board[row][j] = 'R';
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
    

