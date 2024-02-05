class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1, high = position[n-1]/(m-1);
        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(position, mid, m)==true){
                low = mid+1;
            }
            else high = mid-1;
        }
        return high;
    }
    
    boolean canWePlace(int[] stalls, int mid, int k){
        int cowsPlaced = 1, lastPlaced = stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - lastPlaced >= mid){
                cowsPlaced++;
                lastPlaced = stalls[i];
            }
            if(cowsPlaced >= k) return true;
        }
        return false;
    }
}