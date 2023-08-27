class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            int more = target - a;
            if(map.containsKey(more)){
                arr[0] = map.get(more);
                arr[1] = i;
                return arr;
            }
            map.put(a, i);
        }
        return arr;
    }
}