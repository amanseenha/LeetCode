class Solution {
    public int mySqrt(int x) {
        long start = 1, end = x;
        while(start<=end){
            long mid = (start+end)/2;
            long val = mid*mid;
            if(val <= x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return (int)end;
    }
}