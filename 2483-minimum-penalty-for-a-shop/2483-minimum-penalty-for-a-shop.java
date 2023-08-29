class Solution {
    public int bestClosingTime(String customers) {
        int profit = 0;
        int maxProfit = 0;
        int profitPeak = 0;
        for(int i=0; i<customers.length(); i++){
            if(customers.charAt(i) == 'Y'){
                profit++;
                if(profit > maxProfit){
                    maxProfit = profit;
                    profitPeak = i+1;
                }
            }
            else{
                if(profit > maxProfit){
                    maxProfit = profit;
                    profitPeak = i;
                }
                profit--;
            }
        }
        return profitPeak;
    }
}