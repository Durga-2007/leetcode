class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;
        int max = 0;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (img1[i][j] == 1) {

                    for (int x = 0; x < n; x++) {
                        for (int y = 0; y < n; y++) {

                            if (img2[x][y] == 1) {

                                int rowShift = x - i;
                                int colShift = y - j;

                                String key = rowShift + "," + colShift;

                                int count = map.getOrDefault(key, 0) + 1;

                                map.put(key, count);

                                max = Math.max(max, count);
                            }
                        }
                    }
                }
            }
        }

        return max;
    }
}