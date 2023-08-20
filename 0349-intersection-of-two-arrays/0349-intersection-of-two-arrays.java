class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        for(int i: nums2){
            if(set.contains(i)){
                resultSet.add(i);
            }
        }
        int[] arr = new int[resultSet.size()];
        int index = 0;
        for(int i: resultSet){
            arr[index++] = i;
        }
        return arr;
    }
}