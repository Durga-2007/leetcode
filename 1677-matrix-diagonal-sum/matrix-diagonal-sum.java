class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int sum =0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i == j){
                    sum +=mat[i][j];
                }
                else{
                    if( i + j == mat.length -1){
                        sum += mat[i][j];
                    }
                }
            }
        }
        return sum;
    }
}