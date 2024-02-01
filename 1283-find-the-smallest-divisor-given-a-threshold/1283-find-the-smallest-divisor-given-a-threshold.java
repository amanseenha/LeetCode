class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 1000000;
        while(low<=high){
            int mid = (low+high)/2;
            if(divisonSum(nums, mid) <= threshold) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    
    int divisonSum(int[] nums, int mid){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += ( ( (double)nums[i] + (double)mid - 1) / (double)mid );
        }
        return sum;
    }
}