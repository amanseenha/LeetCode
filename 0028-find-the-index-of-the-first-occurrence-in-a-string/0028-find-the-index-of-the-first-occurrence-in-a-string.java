class Solution {
    public int strStr(String haystack, String needle) {
        return helper(haystack, needle, 0);
    }
    public int helper(String haystack, String needle, int index){
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(haystack.startsWith(needle)){
            return index;
        }
        else return helper(haystack.substring(1), needle, index+1);
    }
}