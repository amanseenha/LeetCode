class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(i!=j){
                   swap(matrix, i, j);
                }
            }
        }
        for(int i=0; i<n; i++){
            reverse(matrix, i, n);
        }
    }
    public void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void reverse(int[][] matrix, int i, int n){
        for(int p=0; p<n/2; p++){
            int temp = matrix[i][n-1-p];
            matrix[i][n-1-p] = matrix[i][p];
            matrix[i][p] = temp;
        }
    }
}