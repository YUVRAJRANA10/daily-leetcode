import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -2); // -2 means unvisited
        
        int ans = solve(coins, amount, memo);
        return ans >= 1e9 ? -1 : ans;
    }
    
    private int solve(int[] coins, int target, int[] memo) {
        // Base Cases
        if (target == 0) return 0;
        if (target < 0) return (int) 1e9; // Impossible state
        
        // Return cached result if already calculated
        if (memo[target] != -2) return memo[target];
        
        int minCoins = (int) 1e9;
        
        // Try every coin choice for the current target
        for (int coin : coins) {
            int result = solve(coins, target - coin, memo);
            if (result != 1e9) {
                minCoins = Math.min(minCoins, 1 + result);
            }
        }
        
        return memo[target] = minCoins;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna