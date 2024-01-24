class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxElement(piles);
        while(low <= high){
            int mid = (low+high)/2;
            if(timeToEat(piles, mid) <=h){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
    int maxElement(int[] piles){
        int max=0;
        for(int i=0; i<piles.length; i++){
            if(piles[i]>max) max = piles[i];
        }
        return max;
    }
    int timeToEat(int[] piles, int hourly){
        int totTime = 0;
        for(int i=0; i<piles.length; i++){
            totTime += Math.ceil((double)piles[i]/(double)hourly);
        }
        return totTime;
    }
}