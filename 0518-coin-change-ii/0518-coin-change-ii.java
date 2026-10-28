class Solution {
    public int rec(int idx, int[] coins, int[][] dp, int amt) {
         if (amt == 0) {
            return 1;
        }
        if (idx == coins.length || amt < 0)
            return 0;
    
        if (dp[idx][amt] != -1)
            return dp[idx][amt];

        int take = 0;
        if (coins[idx] <= amt) {
            take = rec(idx, coins, dp, amt - coins[idx]);
        }
        int nottake = rec(idx + 1, coins, dp, amt);

        dp[idx][amt] = take + nottake;

        return dp[idx][amt];

    }

    public int change(int amount, int[] coins) {

        int dp[][] = new int[coins.length][amount + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }

        return rec(0, coins, dp, amount);

    }
}