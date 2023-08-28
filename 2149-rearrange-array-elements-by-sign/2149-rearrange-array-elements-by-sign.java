class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posi = 0;
        int negi = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ans[posi*2] = nums[i];
                posi++;
            }
            else {
                ans[(negi*2) + 1] = nums[i];
                negi++;
            }
        }
        return ans;
    }
}