class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int currentHigh = arr[i];
            arr[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    currentHigh=arr[j];
                    arr[i]=currentHigh;
                }
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}