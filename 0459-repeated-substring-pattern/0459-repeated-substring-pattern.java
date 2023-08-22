public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        int cut = doubled.indexOf(s, 1);
        if (cut >= 1 && cut < s.length()) {
            return true;
        }
        return false;
    }
}