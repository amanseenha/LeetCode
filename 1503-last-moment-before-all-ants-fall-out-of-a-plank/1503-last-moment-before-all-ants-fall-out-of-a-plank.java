class Solution {
    int findMin(int n, int arr1[], int arr2[]){
        int res = Integer.MIN_VALUE;
        for(int e: arr2) res = Integer.max(res, n - e);
        for(int e: arr1) res = Integer.max(res, e);
        return res;
    }
    public int getLastMoment(int n, int[] left, int[] right) {
        return Integer.min(n, findMin(n, left, right));
    }
}