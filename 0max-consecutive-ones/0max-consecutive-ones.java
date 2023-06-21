class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for(int i=0;i<nums.length;){
            if(nums[i]==1){
                count++;
                    if(count>maxCount){
                    maxCount = count;
                }
                i++;
            }
            else if(nums[i]==0){
                count=0;
                i++;
            }
            
        }
        return maxCount;
    }
}