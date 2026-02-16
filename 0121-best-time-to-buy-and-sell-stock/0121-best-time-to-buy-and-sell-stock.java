class Solution {
    public int maxProfit(int[] prices) {
  
    // int min = 0;
    //     for(int i = 1; i< prices.length; i++){
    //         if(prices[i] < prices[min] && i!= prices.length -1){
    //             min = i;
    //         }
    //     }

    // int max = min;
    //     for(int j = min+1 ; j < prices.length;j++ ){

    //         if(prices[j] > prices[max]){
    //             max = j;
    //         }
    //     }
    
    //  return prices[max] - prices[min];
int profit = 0;
      for(int i = 0; i < prices.length -1; i++){
        int min = i;
        for(int j = i+1; j < prices.length; j++){
             
             if((prices[j] - prices[i])  > profit){
                profit = prices[j] - prices[i];
             }
        }
      }

return profit;
    }
}