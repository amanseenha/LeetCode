class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;
        ArrayList<Integer> list = new ArrayList<>();
        if(n==1 && m==1){
            list.add(matrix[0][0]);
            return list;
        }
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}