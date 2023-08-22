class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1){
            return 1-nums[0];
        }
        int maxElement = nums.length;
        int[] hash = new int[maxElement+1];
        for(int i=0; i<maxElement; i++){
            for(int j=0; j<=maxElement; j++){
                if(nums[i]==j){
                    hash[j]++;
                }
            }
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
}