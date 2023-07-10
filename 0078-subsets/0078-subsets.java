class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> inner = new ArrayList<>();
        return helper(inner, nums, 0);
    }
    public List<List<Integer>> helper(List<Integer> inner, int[] arr, int index){
        if(index==arr.length){
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(inner);
            return outer;
        }
        int num = arr[index];
        List<List<Integer>> left = helper(new ArrayList<>(inner), arr, index+1);
        inner.add(num);
        List<List<Integer>> right = helper(inner, arr, index+1);
        left.addAll(right);
        return left;
    }
}
