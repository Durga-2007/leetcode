class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean ans = true;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j<s.length() && s.charAt(j)==t.charAt(i)){
                j++;
            }
        }
        if(j != s.length()){
            ans = false;
        }
        return ans;
    }
}