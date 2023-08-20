class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        d = n - d;
		int[] temp = Arrays.copyOf(arr, d);
		for (int i = d; i < n; i++) {
			arr[i-d] = arr[i];
		}
		int j = 0 ;
		for(int i=n-d; i<n; i++){
			arr[i] = temp[j];
			j++;
		}
    }
}