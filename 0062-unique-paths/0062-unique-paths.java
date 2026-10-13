class Solution {
    // public int rc(int i, int j,int[][] dp) {
    //     if (i == 0 && j == 0)
    //         return 1;
    //     if (i < 0 || j < 0)
    //         return 0;
    //     if(dp[i][j] != -1)return dp[i][j];

    //     int left = rc(i, j - 1,dp);
    //     int up = rc(i - 1, j,dp);
    //     dp[i][j] = left+up;
    //     return dp[i][j];
    // }

    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];   
        dp[0][0] = 1;

        //  for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }  
        // return rc(m - 1, n - 1,dp);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Skip the starting cell since it's already initialized
                if (i == 0 && j == 0) continue;
                
                int up = 0;
                int left = 0;
                
                // If we can come from the cell above
                if (i > 0) {
                    up = dp[i - 1][j];
                }
                // If we can come from the cell to the left
                if (j > 0) {
                    left = dp[i][j - 1];
                }
                
                // Total ways to reach (i, j) is the sum of paths from 'up' and 'left'
                dp[i][j] = up + left;
            }
        }
        return dp[m-1][n-1];

    }
}