class Solution {
    public int lengthOfLastWord(String s) {
        String news = s.trim();
        int i = news.length()-1, count = 0;
        while(i != -1 && news.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
}