class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if(len == 1 || nums[0] != nums[1]) return nums[0];
        if(nums[len-1] != nums[len-2]) return nums[len-1];
        int start = 1, end = len-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                start = mid+1;
            }
            else end = mid-1;
        }
        return -1;
    }
}