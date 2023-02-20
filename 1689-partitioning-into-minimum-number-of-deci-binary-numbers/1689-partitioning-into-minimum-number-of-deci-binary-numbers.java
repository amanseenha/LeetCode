class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            if(digit > maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }
}
