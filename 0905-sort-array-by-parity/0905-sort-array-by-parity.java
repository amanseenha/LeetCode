class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return nums;
    }
}