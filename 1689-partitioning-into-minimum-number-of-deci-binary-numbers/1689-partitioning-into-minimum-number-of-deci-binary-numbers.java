class Solution {
    public int minPartitions(String n) {
        char maxChar = '0';
        for(char c : n.toCharArray()) {
            if(c > maxChar) {
                maxChar = c;
            }
        }
        return Character.getNumericValue(maxChar);
    }
}
