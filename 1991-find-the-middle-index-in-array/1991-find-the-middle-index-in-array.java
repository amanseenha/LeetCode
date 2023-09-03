class Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        for(int i: nums){
            rightSum += i;
        }
        for(int i=0; i<len; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}