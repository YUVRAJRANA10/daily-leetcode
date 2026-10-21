class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        
        // Initialize dp array with an amount larger than any possible valid answer
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;
        
        // Build up the solution from 1 to amount
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (i - c >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - c]);
                }
            }
        }
        
        // If dp[amount] is still amount + 1, it means it's impossible to make that amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}