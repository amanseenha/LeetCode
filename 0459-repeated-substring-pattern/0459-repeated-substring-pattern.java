class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0 && s.charAt(i - 1) == s.charAt(len - 1)) {
                if (s.substring(0, i).repeat(len / i).equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }}