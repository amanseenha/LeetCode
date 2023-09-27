class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1, ans = end+1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>=target){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
}