class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[nums.length];
        int pre = 1, post = 1;
        ans[0] = pre;
        for(int i=0; i<len-1; i++){
            pre = nums[i] * pre;
            ans[i+1] = pre;
        }
        for(int i=len-1; i>=1; i--){
            post = nums[i] * post;
            ans[i-1]*=post;
        }
        return ans;
    }
}