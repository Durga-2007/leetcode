class Solution {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] result = new int[rows * cols][2];

        int index = 0;

        result[index][0] = rStart;
        result[index][1] = cStart;
        index++;

       
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int direction = 0;
        int steps = 1;

        int r = rStart;
        int c = cStart;

        while (index < rows * cols) {

            
            for (int turn = 0; turn < 2; turn++) {

                for (int move = 0; move < steps; move++) {

                    r += dr[direction];
                    c += dc[direction];

                   
                    if (r >= 0 && r < rows &&
                        c >= 0 && c < cols) {

                        result[index][0] = r;
                        result[index][1] = c;
                        index++;
                    }
                }

               
                direction = (direction + 1) % 4;
            }

        
            steps++;
        }

        return result;
    }
}