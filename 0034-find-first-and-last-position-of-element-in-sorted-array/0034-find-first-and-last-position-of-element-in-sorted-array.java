class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if(ans[0] != -1)
        {
        ans[1] = search(nums, target, false);    
        }
        return ans;
    }

    int search(int[] nums, int target, boolean startIndex) {
        int s = 0, e = nums.length - 1, ans = -1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (nums[m] > target) 
            {
                e = m - 1;
               
            } 
            else if (nums[m] < target) 
            {
                s = m + 1;
            } 
            else 
            {
                ans = m;
                if (startIndex) {
                    e = m - 1;
                } 
                else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}