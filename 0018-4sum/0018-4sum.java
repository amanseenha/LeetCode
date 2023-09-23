class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<len; j++){
                if(j != (i+1) && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = len-1;
                while(k<l){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> inner = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        outer.add(inner);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }
        return outer;
    }
}