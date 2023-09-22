class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> outer = new ArrayList<>();
        for(int i=0; i<len; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = len-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> inner = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    outer.add(inner);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return outer;
    }
}