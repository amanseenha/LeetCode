class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> inner = new ArrayList<>();
        return helper(nums, inner, 0);
    }
    public List<List<Integer>> helper(int[] nums, List<Integer> inner, int index){
        if(index == nums.length){
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>(inner));
            return outer;
        }
        List<List<Integer>> outer = new ArrayList<>();
        for(int i=0; i<=inner.size(); i++){
            inner.add(i, nums[index]);
            outer.addAll(helper(nums, new ArrayList<>(inner), index+1));
            inner.remove(i);
        }
        return outer;
    }
    
}