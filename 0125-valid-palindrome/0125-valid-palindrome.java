class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        String str = "";
        String reverse = "";
        
        for(int i=0; i<lower.length(); i++){
            char ch = lower.charAt(i);
            if(('a'<=lower.charAt(i) && lower.charAt(i)<='z') || ('0'<=lower.charAt(i) && lower.charAt(i)<='9')){
                str = str + ch;
                reverse = ch + reverse;
            }
        }
        
        if(reverse.equals(str)){
            return true;
        }
        System.out.println(str);
        System.out.println(reverse);
        return false;
    }
}