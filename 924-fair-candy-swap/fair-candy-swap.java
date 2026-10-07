import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int x : bobSizes) {
            sumB += x;
        }

        int difference = (sumA - sumB) / 2;

        Arrays.sort(bobSizes);

        for (int a : aliceSizes) {

            int b = a - difference;

            if (Arrays.binarySearch(bobSizes, b) >= 0) {
                return new int[]{a, b};
            }
        }

        return new int[]{};
    }
}