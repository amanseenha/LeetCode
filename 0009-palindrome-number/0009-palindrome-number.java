class Solution {
    public boolean isPalindrome(int x) {
        int n = x, rem, rev=0;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}