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





        // if (nums == null || nums.length == 0) return 0;
        
        // int n = nums.length;
        // int[] dp = new int[n];
        // // Every element is an increasing subsequence of length 1 by itself
        // java.util.Arrays.fill(dp, 1);
        // int globalMax = 1;
        
        // // Outer loop: equivalent to checking every index as an endpoint
        // for (int i = 0; i < n; i++) {
        //     // Inner loop: look backward from i - 1 down to 0
        //     for (int prev = i - 1; prev >= 0; prev--) {
        //         if (nums[i] > nums[prev]) {
        //             dp[i] = Math.max(dp[i], dp[prev] + 1);
        //         }
        //     }
        //     // Keep track of the maximum length found anywhere in the array
        //     globalMax = Math.max(globalMax, dp[i]);
        // }
        
        // return globalMax;
    }
}