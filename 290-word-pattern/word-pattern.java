import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (patternToWord.containsKey(ch)) {
                if (!patternToWord.get(ch).equals(word)) {
                    return false;
                }
            }
            else {
                if (wordToPattern.containsKey(word)) {
                    return false;
                }

                patternToWord.put(ch, word);
                wordToPattern.put(word, ch);
            }
        }

        return true;
    }
}