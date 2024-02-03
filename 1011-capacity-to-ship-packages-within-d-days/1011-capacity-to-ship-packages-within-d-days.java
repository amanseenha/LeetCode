class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxEl(weights), high = 25000000;
        while(low<=high){
            int mid = (low+high)/2;
            if(daysRequired(weights, mid) <= days) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    
    int daysRequired(int[] weights, int mid){
        int days = 1, load = 0;
        for(int i=0; i<weights.length; i++){
            if(load + weights[i] > mid){
                days += 1;
                load = weights[i];
            }
            else load += weights[i];
        }
        return days;
    }
    
    int maxEl(int[] weights){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            if(weights[i]>max) max = weights[i];
        }
        return max;
    }
}