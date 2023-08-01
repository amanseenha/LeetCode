class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i : nums){
            if(i==max || i==secondMax || i==thirdMax){
                continue;
            }
            else if(i>max){
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            else if(i>secondMax){
                thirdMax = secondMax;
                secondMax = i;
            }
            else if(i>thirdMax){
                thirdMax = i;
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            return (int)max;
        }
        return (int)thirdMax;
    }
}