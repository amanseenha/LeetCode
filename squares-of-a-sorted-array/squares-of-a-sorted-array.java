class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];
        int left = 0, right = nums.length-1;
        while(left<=right){
            for(int i=nums.length-1; i>=0; i--)
                if(Math.abs(nums[left]) > Math.abs(nums[right])){
                    squared[i] = nums[left]*nums[left];
                    left++;
                }
                else{
                    squared[i] = nums[right]*nums[right];
                    right--;
                }
        }
        return squared;
    }
}