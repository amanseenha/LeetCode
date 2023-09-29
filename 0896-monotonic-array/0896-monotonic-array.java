class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 1, dec = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]) inc = 0;
            else if(nums[i] < nums[i+1]) dec = 0;
            if(inc == 0 && dec == 0) return false;
        }
        return true;
    }
}
