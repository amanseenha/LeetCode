class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        if(len == 1){
            list.add(nums[0]);
            return list;
        }
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1 = nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i : nums){
            if(i == el1) cnt1++;
            else if(i == el2) cnt2++;
        }
        int minAppearance = (len/3);
        if(cnt1>minAppearance) list.add(el1);
        if(cnt2>minAppearance) list.add(el2);
        return list;
    }
}