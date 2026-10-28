
class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char num = board[i][j];

                if (num == '.') {
                    continue;
                }

                for (int k = 0; k < 9; k++) {

                    if (k != j && board[i][k] == num) {
                        return false;
                    }

                    if (k != i && board[k][j] == num) {
                        return false;
                    }

                    int row = 3 * (i / 3) + k / 3;
                    int col = 3 * (j / 3) + k % 3;

                    if ((row != i || col != j)
                            && board[row][col] == num) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
