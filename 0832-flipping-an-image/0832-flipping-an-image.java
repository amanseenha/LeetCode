class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0; i<n; i++){
            flip(image, i, n);
            invert(image, i, n);
        }
        return image;
    }
    public void flip(int[][] image, int row, int len){
        for(int p=0; p<len/2; p++){
            int temp = image[row][p];
            image[row][p] = image[row][len - 1 - p];
            image[row][len - 1 - p] = temp;
        }
    }
    public void invert(int[][] image, int row, int len){
        for(int i=0; i<len; i++){
            if(image[row][i] == 0) image[row][i] = 1;
            else image[row][i] = 0;
        }
    }
}