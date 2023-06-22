class Solution {
    public boolean isSubsequence(String s, String t) {
        return subSequenceGenerator(s, t, 0, 0);
    }
    public boolean subSequenceGenerator(String s, String t, int sIndex, int tIndex) {
        if (sIndex == s.length()) {
            return true;
        }
        if (tIndex == t.length()) {
            return false;
        }

        if (s.charAt(sIndex) == t.charAt(tIndex)) {
            return subSequenceGenerator(s, t, sIndex + 1, tIndex + 1);
        } else {
            return subSequenceGenerator(s, t, sIndex, tIndex + 1);
        }
    }
}
