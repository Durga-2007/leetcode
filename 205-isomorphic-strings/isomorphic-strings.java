class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character>sToT = new HashMap<>();
        HashMap<Character , Character>tToS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(sToT.containsKey(a)){
                if(sToT.get(a)!=b){
                    return false;
                }
            }
            else{
                if(tToS.containsKey(b)){
                    return false;
                }
                sToT.put(a, b);
                tToS.put(b, a);
            }
        }
        return true;
    }
}