class Solution {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        for(int i=1; i<=row; i++){
            int ans = 1;
            inner.add(ans);
            for(int col=1; col<i; col++){
                ans = ans*(i-col)/col;
                inner.add(ans);
            }
            outer.add(inner);
            inner = new ArrayList<>();
        }
        return outer;
    }
}