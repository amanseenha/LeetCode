class Solution {
    public int heightChecker(int[] heights) {
        int k = 0;
        int expected[] = new int[heights.length];
        System.arraycopy(heights,0, expected, 0, heights.length);
        Arrays.sort(expected);
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=expected[i]){
                k++;
            }
        }
        return k;
    }
}