class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE; // smallest price seen so far
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            // update minimum buying price
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // calculate profit if sold today
            int profitToday = prices[i] - minPrice;

            // update maximum profit
            if(profitToday > maxProfit) {
                maxProfit = profitToday;
            }
        }

        return maxProfit;
    }
}
