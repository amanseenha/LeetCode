class Solution {
    public String reorganizeString(String s) {
        int[] charCount = new int[26];
        int maxFreq = 0;
        int maxChar = 0;
        
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
            if (charCount[c - 'a'] > maxFreq) {
                maxFreq = charCount[c - 'a'];
                maxChar = c - 'a';
            }
        }
        
        if (maxFreq > (s.length() + 1) / 2) {
            return "";
        }
        
        char[] result = new char[s.length()];
        int idx = 0;
        
        while (charCount[maxChar] > 0) {
            result[idx] = (char) (maxChar + 'a');
            idx += 2;
            charCount[maxChar]--;
        }
    
        for (int i = 0; i < charCount.length; i++) {
            while (charCount[i] > 0) {
                if (idx >= result.length) {
                    idx = 1;
                }
                result[idx] = (char) (i + 'a');
                idx += 2;
                charCount[i]--;
            }
        }
        
        return new String(result);
    }
}
