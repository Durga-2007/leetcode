class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int maxCount = 0;
        int col = accounts[0].length;
        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<col;j++){
                sum += accounts[i][j];
            }
            if(sum>maxCount){
                maxCount = sum;
            }
        }
        return maxCount;
    }
}