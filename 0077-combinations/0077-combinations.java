class Solution {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> ans = new ArrayList<>();
    helper(n, k, 1, new ArrayList<>(), ans);
    return ans;
  }

  private void helper(int n, int k, int s, List<Integer> inner, List<List<Integer>> ans) {
    if (inner.size() == k) {
      ans.add(new ArrayList<>(inner));
      return;
    }

    for (int i = s; i <= n; ++i) {
      inner.add(i);
      helper(n, k, i + 1, inner, ans);
      inner.remove(inner.size() - 1);
    }
  }
}
