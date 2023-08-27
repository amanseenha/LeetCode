class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.getOrDefault(i,0)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> i: map.entrySet()){
            if(i.getValue() > nums.length/2){
                return i.getKey();
            }
        }
        return -1;
    }
}