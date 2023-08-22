class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String substring = s.substring(0, len);
                int repeats = n / len;
                StringBuilder repeated = new StringBuilder();
                
                for (int i = 0; i < repeats; i++) {
                    repeated.append(substring);
                }
                
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
