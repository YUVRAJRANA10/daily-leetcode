class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        // we will not take the first elemtn in num1 and in num2 not the last one
        int[] sub1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        // Option 2: Exclude the first house (from index 1 to n-1)
        int[] sub2 = Arrays.copyOfRange(nums, 1, nums.length);

        return Math.max(robLinear(sub1), robLinear(sub2));
    }

    public int robLinear(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums.length - 1, nums, dp);
    }

    public int helper(int index, int[] nums, int[] dp) {
        if (index == 0) {
            return nums[0];
        }
        if (index < 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }

        int take = nums[index] + helper(index - 2, nums, dp);
        int nottake = 0 + helper(index - 1, nums, dp);

        dp[index] = Math.max(take, nottake);
        return dp[index];
    }
}