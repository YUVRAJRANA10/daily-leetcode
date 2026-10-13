class Solution {
    public int rc(int i, int j, int[][] dp, int[][] og) {
        // if (i != 0 && j != 0 && og[i][j] == 1) {
        //     return 0;
        // }f
        if (i < 0 || j < 0)
            return 0;
        if (og[i][j] == 1) {
            return 0;
        }

        if (i == 0 && j == 0)
            return 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        int left = rc(i, j - 1, dp, og);
        int up = rc(i - 1, j, dp, og);
        dp[i][j] = left + up;
        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return rc(m - 1, n - 1, dp, obstacleGrid);

    }
}