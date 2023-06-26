class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                return helper(nums, original*2);
            }
            else if(i==nums.length){
                return original;
            }
        }
       return original;
    }
    public int helper(int[] nums, int original){
        int j = 0;
        while(j<nums.length){
            if(nums[j]==original){
                original=nums[j]*2;
                j=-1;
            }
            j++;
        }
        return original;
    }
}