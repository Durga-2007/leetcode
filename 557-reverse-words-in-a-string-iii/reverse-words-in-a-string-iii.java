class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        String result = "";
        for(int i=0;i<word.length;i++){
            String rev = "";
            for(int j=word[i].length() - 1;j>=0;j--){
                rev = rev + word[i].charAt(j);
            }
            result = result + rev;
            if(i<word.length - 1){
                result = result + " ";
            }
        }
        return result;
    }
}