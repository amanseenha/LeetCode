class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            int start = 0;
            int end = matrix[i].length - 1;
            if(target >= matrix[i][start] && target <= matrix[i][end]){
                while(start<=end){
                int middle = (start+end)/2;
                    if(target < matrix[i][middle]){
                        end = middle - 1;
                    }
                    else if(target > matrix[i][middle]){
                        start = middle + 1;
                    }
                    else if(target == matrix[i][middle]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}