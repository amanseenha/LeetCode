class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        int k = 1;
        int pairs = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
            pairs++;
            }
            else{
                pairs = 0;
            }
            if(pairs<=1){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}