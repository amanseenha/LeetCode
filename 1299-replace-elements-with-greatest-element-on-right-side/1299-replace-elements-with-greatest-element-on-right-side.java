class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int maxi = -1;
        for(int i=len-1; i>=0; i--){
            int currElement = arr[i];
            arr[i] = maxi;
            maxi = Math.max(currElement, maxi);
        }
        return arr;
    }
}