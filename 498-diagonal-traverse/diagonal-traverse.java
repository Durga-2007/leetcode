class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int index = 0;

        for (int sum = 0; sum < m + n - 1; sum++) {

            if (sum % 2 == 0) {
 
                int row = Math.min(sum, m - 1);
                int col = sum - row;

                while (row >= 0 && col < n) {
                    result[index++] = mat[row][col];
                    row--;
                    col++;
                }

            } else {
              
                int col = Math.min(sum, n - 1);
                int row = sum - col;

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