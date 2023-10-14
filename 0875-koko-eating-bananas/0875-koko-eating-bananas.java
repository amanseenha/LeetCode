class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = maxBananas(piles), hours = 0;
        while(start<=end){
            int mid = (start+end)/2;
            hours = timeToEat(piles, mid);
            if(hours<=h){
                end = mid-1;
            }
            else start = mid+1;
        }
        return start;
    }
    public int timeToEat(int[] piles, int bph){
        int totalHours = 0;
        for(int i = 0; i < piles.length; i++){
            totalHours += Math.ceil((double)piles[i]/(double)bph);
        }
        return totalHours;
    }
    public int maxBananas(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }
}