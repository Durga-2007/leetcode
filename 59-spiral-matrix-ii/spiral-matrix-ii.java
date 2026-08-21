class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int val = 1;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // top
            for (int j = left; j <= right; j++) {
                mat[top][j] = val++;
            }
            top++;

            // right
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = val++;
            }
            right--;

            // bottom
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    mat[bottom][j] = val++;
                }
                bottom--;
            }

            // left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = val++;
                }
                left++;
            }
        }

        return mat;
    }
}