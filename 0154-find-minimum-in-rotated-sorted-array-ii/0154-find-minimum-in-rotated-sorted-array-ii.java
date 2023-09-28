class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1, ans = Integer.MAX_VALUE;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else if(nums[start] < nums[mid]){
                end = mid-1;
            }
            else{
                start++;
                end--;
            }
            ans = Math.min(ans, nums[mid]);
        }
        return ans;
    }
}