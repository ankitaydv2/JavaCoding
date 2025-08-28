package Backtracking;

public class SodukoSolver {
    public boolean isSafe(char[][]board, int row, int col, int number){
        // row & col
        // for safety k liye col and row mai check krke and after that grid mai chcek kr lenge 
        for(int i =0; i< board.length; i++){
            if(board[i][col] == (char)(number+ '0')){
                return false;
            }
            if(board[row][i] == (char)(number+ '0')){
                return false;
            }
        }
          // grid 
          int sr = (row/3)*3;
          int sc = (col/3)*3;

          for(int i = sr; i<sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j]==(char)(number+'0')){
                    return false;
                }
            }
          }
          return true;
    }
    public boolean helper(char[][] board, int row , int col){
        //base case 
        if(row == board.length){
            return true;
        }
// new row k liye rtecurssion
        int nrow = 0;
        int ncol=0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        } else{
            nrow = row+1;
            ncol = 0;
        }
        if(board[row][col]!='.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        } else{ /// check it is safe to put the numbers 
            for(int i = 1; i<=9; i++){
                if(isSafe(board, row, col, i)){
                     board[row][col] = (char)(i+'0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    } else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
/* for printing the sukudo , we write print and main functn  */
    private static void printBoard(char[][] b) {
        for (int r = 0; r < b.length; r++) {
            for (int c = 0; c < b[0].length; c++) {
                System.out.print(b[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        SodukoSolver solver = new SodukoSolver();
        boolean solved = solver.helper(board, 0, 0); // or solver.solveSuduku(board);
        if (solved) {
            System.out.println("Solution:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}