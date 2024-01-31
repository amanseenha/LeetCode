class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxPile(piles);
        while(low<=high){
            int mid = (low+high)/2;
            if(totalTimetoEat(piles, mid)<=h) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    
    int maxPile(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            if(piles[i]>max) max = piles[i];
        }
        return max;
    }
    
    int totalTimetoEat(int[] piles, int mid){
        int totalTime = 0;
        for(int i=0; i<piles.length; i++){
            totalTime += Math.ceil((double)piles[i]/(double)mid);
        }
        return totalTime;
    }
}