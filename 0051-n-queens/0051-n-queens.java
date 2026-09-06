class Solution {
        public boolean isSafe(int row, int col, char[][] board) {

        // Check column upwards
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> ans) {

        List<String> currentBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            currentBoard.add(new String(board[i]));
        }

        ans.add(currentBoard);
    }

    public void solve(int row, char[][] board, List<List<String>> ans){
        if(row == board.length){
            saveBoard(board,ans);
            return;
        }
        
        for(int col = 0 ; col < board[row].length; col++){

        if(!isSafe(row,col,board))continue;

        board[row][col] = 'Q';
        solve(row+1,board,ans);
        board[row][col] = '.';
        }

    }
    public List<List<String>> solveNQueens(int n) {
          
          char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');

        }
        List<List<String>> ans = new ArrayList<>();

        solve(0,board,ans);
        return ans;
    }
}