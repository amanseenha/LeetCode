class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length*2];
        int tempIndex = 0;
        int arrIndex = 0;
        while(tempIndex + arrIndex < arr.length && arr.length > 1){
            if(arr[arrIndex] == 0){
                temp[arrIndex + tempIndex] = 0;
                temp[arrIndex + tempIndex + 1] = 0;
                tempIndex += 1;
                arrIndex += 1;
            }
            else{
                temp[tempIndex + arrIndex] = arr[arrIndex];
                arrIndex += 1;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
}