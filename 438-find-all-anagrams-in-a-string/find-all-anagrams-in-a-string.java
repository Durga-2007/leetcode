class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if(p.length()>s.length()){
            return result;
        }
        int[] countP = new int[26];
        int[] countS = new int[26];

        for(char ch : p.toCharArray()){
            countP[ch - 'a']++;
        }
        int left = 0;
        for(int right =0;right<s.length();right++){
            countS[s.charAt(right) - 'a']++;
            if(right - left + 1 > p.length()){
                countS[s.charAt(left) - 'a']--;
                left++;
            }
            if(right - left + 1 == p.length()){
                if(Arrays.equals(countP,countS)){
                    result.add(left);
                }
            }
        }
        return result;
    }
}