class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((double)bloomDay.length < (double)m * (double) k) return -1;
        int low = minValue(bloomDay), high = maxValue(bloomDay);
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay, mid, m, k)) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    
    boolean possible(int[] arr, int day, int m, int k){
        int cntr = 0, noOfB = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= day) cntr++;
            else{
                noOfB += cntr/k;
                cntr = 0;
            }
        }
        noOfB += cntr/k;
        return noOfB >= m;
    }
    
    int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }
    
    int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}