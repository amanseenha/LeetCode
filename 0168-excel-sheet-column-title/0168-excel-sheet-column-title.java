class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            char digit = (char) ('A' + remainder);
            title.insert(0, digit);
            columnNumber = (columnNumber - 1) / 26;
        }

        return title.toString();
    }
}
