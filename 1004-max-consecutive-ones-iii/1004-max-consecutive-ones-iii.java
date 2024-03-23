class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int i=0, j=-1;
        int zeros = 0;
        while(i<nums.length){
            //acquire
            if(nums[i]==0){
                zeros++;
                i++;
            }
            else{
                i++;
            }
            //release if invalid
            while(zeros > k){
                j++;
                if(nums[j] == 0){
                    zeros--;
                }
            }
            //consider
            int size = i - 1 - j;
            if(size > ans) ans = size;
        }
        return ans;
    }
}