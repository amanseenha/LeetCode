class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1;
        int[] squares = new int[nums.length];
        while(left<=right){
            for(int i = nums.length-1;i>=0;i--){

                if(Math.abs(nums[left])>Math.abs(nums[right])){
                squares[i] = nums[left]*nums[left];
                    left++;
                }

                else{
                    squares[i] = nums[right]*nums[right];
                    right--;
                }
            }
        }
        return squares;
    }
}