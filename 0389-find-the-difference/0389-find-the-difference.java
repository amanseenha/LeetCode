class Solution {
    public char findTheDifference(String s, String t) {
        int expAscii = 0;
        int actualAscii = 0;
        for(int i=0; i<s.length(); i++){
            expAscii += (int)s.charAt(i);
        }
        for(int i=0; i<t.length(); i++){
            actualAscii += (int)t.charAt(i);
        }
        char ch = (char)(actualAscii - expAscii);
        return ch;
    }
}