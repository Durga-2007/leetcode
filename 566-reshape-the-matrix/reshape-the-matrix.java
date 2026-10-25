class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int cols = mat[0].length;
        int index = 0;
        if( r * c != row*cols){
            return mat;
        }
        int result[][] = new int[r][c];
        for(int i = 0;i<row; i++){
            for(int j = 0;j<cols ;j++){
                result[index / c][index % c]  = mat[i][j];
                index++;
            }
        }
        return result;
    }
}