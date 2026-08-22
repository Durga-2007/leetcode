class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int index = 0;

        for (int i = 0; i < m + n - 1; i++) {

            if (i% 2 == 0) {
 
                int row = Math.min(i, m - 1);
                int col = i - row;

                while (row >= 0 && col < n) {
                    result[index++] = mat[row][col];
                    row--;
                    col++;
                }

            } else {
              
                int col = Math.min(i, n - 1);
                int row = i- col;

                while (row < m && col >= 0) {
                    result[index++] = mat[row][col];
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}