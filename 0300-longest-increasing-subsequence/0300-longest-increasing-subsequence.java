class Solution {
    public int rec(int index,int[] nums, int[] dp){
        // if(index < 0)return 0;
        if(index == 0)return 1;
        if(dp[index] != -1)return dp[index];

        int maxLen = 1;
        for (int prev = index - 1; prev >= 0; prev--) {
            if (nums[index] > nums[prev]) {
                maxLen = Math.max(maxLen, rec(prev, nums, dp) + 1);
            }
        }

        return dp[index]=maxLen;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);

         int globalMax = 1;
        
        // Check every index as a potential ending point for the LIS
        for (int i = 0; i < n; i++) {
            globalMax = Math.max(globalMax, rec(i, nums, dp));
        }

        return globalMax;
    }
}