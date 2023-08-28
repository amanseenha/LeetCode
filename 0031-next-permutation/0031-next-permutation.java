class Solution {
    public void reverse(int[] nums, int start, int end){
    int mid = (start + end)/2;
        for(int i=start; i<=mid; i++){
            int temp = nums[i];
            nums[i] = nums[end - (i - start)];
            nums[end - (i - start)] = temp;
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void nextPermutation(int[] nums) {
        int index = -1;
        int len = nums.length;
        for(int i = len-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index!=-1){
            for(int i = len-1; i>=index; i--){
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        }
        reverse(nums, index+1, len-1);
    }
}