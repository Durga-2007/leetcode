class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            count[ch - 'A']++;
            maxFreq = Math.max(maxFreq, count[ch - 'A']);
            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}