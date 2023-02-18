class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)!='.'){
                ans+=address.charAt(i);
            }
            else if(address.charAt(i)=='.'){
                ans+="[.]";
            }
        }
        return ans;
    }
}