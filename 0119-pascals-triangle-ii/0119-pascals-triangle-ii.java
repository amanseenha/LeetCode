class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        long ans = 1;
        for(int col=1; col<=rowIndex; col++){
            ans *= (rowIndex-col+1);
            ans /= col;
            list.add((int)ans);
        }
        return list;
    }
}