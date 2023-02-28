class Solution {
    public int differenceOfSum(int[] nums) {
     int sum=0, digiSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            int n=nums[j];
            while(n>0){
                digiSum += n%10;
                n = n/10;
            }
        }
        return Math.abs(digiSum-sum);
    }
}