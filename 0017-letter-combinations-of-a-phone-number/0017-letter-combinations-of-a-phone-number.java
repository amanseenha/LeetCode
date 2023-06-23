class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            ArrayList<String> str = new ArrayList<>();
            return str;
        }
        return solve("",digits);
    }
    public static List<String> solve(String p, String up) {
        
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit = up.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int range = i+3;
        if(digit == 7 || digit == 9) {
            range+=1;
        }
        
        ArrayList<String> list = new ArrayList<>();
                
        for(; i<range; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(p+ch, up.substring(1)));
        }
        
        return list;
        
    }
}