import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // Start from the bottom-right corner
        return countPaths(m - 1, n - 1, dp);
    }
    
    private int countPaths(int r, int c, int[][] dp) {
        // Base case: Reached the top-left corner
        if (r == 0 && c == 0) {
            return 1;
        }
        // Base case: Out of bounds
        if (r < 0 || c < 0) {
            return 0;
        }
        // Return already computed result
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        
        // Calculate paths coming from the Left and from the Top
        int left = countPaths(r, c - 1, dp);
        int top  = countPaths(r - 1, c, dp);
        
        // Add them together and store in dp
        dp[r][c] = left + top;
        return dp[r][c];
    }
}