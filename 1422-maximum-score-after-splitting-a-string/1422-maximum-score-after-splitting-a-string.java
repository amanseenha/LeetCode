class Solution {
    public int maxScore(String s) {
        int zeros = 0, ones = 0, maxScore = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)-'0' == 0) zeros++;
                for(int j=s.length()-1; j>i; j--){
                    if(s.charAt(j)-'0' == 1) ones++;
                }
            if(ones+zeros > maxScore) maxScore = zeros+ones;
            ones = 0;
        }
        return maxScore;
    }
}