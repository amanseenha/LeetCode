class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int initialMoney = money;
        money = money - (prices[0] + prices[1]);
        if(money >= 0) return money;
        return initialMoney;
    }
}