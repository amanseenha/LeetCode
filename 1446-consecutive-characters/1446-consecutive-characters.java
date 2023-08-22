class Solution {
    public int maxPower(String s) {
        int power = 1;
        int maxPower = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                power++;
            }
            else{
                if(power>maxPower) maxPower = power;
                power = 1;
            }
        }
        if(power>maxPower) maxPower = power;
        return maxPower;
    }
}