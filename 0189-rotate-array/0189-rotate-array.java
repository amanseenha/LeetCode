class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        d = n - d;
        
        if (d == 0) {
            return;
        }
        
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        for (int i = n - d, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }
}
