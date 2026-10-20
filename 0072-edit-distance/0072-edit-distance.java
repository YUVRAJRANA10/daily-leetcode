class Solution {
    public int minDistance(String word1, String word2) { 
        
       int m = word1.length();
        int n = word2.length();
        
        // Initialize memoization table with -1
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        
        return solve(word1, m, word2, n, dp);

    }

    public int solve(String s1, int i, String s2, int j, int[][] dp){

            if(i == 0)return j;
            if(j == 0)return i;

            if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = solve(s1, i - 1, s2, j - 1, dp);
        }
        int insertOp = solve(s1, i, s2, j - 1, dp);
        int deleteOp = solve(s1, i - 1, s2, j, dp);
        int replaceOp = solve(s1, i - 1, s2, j - 1, dp);
        return dp[i][j] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));


    }

}