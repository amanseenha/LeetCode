class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el = nums[0];
        for(int i: nums){
            if(count == 0){
                count = 1;
                el = i;
            }
            else if(i == el) count++;
            else count--;
        }
        return el;
    }
}