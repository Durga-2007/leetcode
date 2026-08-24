class Solution {

    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] next = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int liveNeighbors = countLiveNeighbors(board, i, j);

            
                if (board[i][j] == 1) {
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        next[i][j] = 1;
                    } else {
                        next[i][j] = 0;
                    }
                }

                else {
                    if (liveNeighbors == 3) {
                        next[i][j] = 1;
                    }
                }
            }
        }

   
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = next[i][j];
            }
        }
    }


    public int countLiveNeighbors(int[][] board, int row, int col) {

        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {

                if (i == row && j == col) {
                    continue;
                }

                if (i >= 0 && i < board.length &&
                    j >= 0 && j < board[0].length &&
                    board[i][j] == 1) {

                    count++;
                }
            }
        }

        return count;
    }
}