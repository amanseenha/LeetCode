class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        
        for(int num: set){
            //check if num is a starting number
            if(!set.contains(num-1)){
                //find consecutive numbers
                int cnt = 1;
                int el = num;
                while(set.contains(el+1)){
                    el += 1;
                    cnt += 1;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
}