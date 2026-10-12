class Solution {
    public int rob(int[] nums) {
        //tabulattion bottom top
        // int dp[] = new int[nums.length];
        // dp[0] = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     int take = nums[i];
        //     if (i > 1) {
        //         take = nums[i] + dp[i - 2];
        //     }
        //     int nottake = 0 + dp[i - 1];
        //     dp[i] = Math.max(take, nottake);
        // }
        // return dp[nums.length - 1];
          if(nums.length == 1)return nums[0];
           int prev1 = nums[0];
           int prev2 = 0;
           int curr = 0;
           for(int i =1 ; i<nums.length;i++){
            int take = nums[i];
            if(i>1)take = nums[i] + prev2;
            int nottake = 0 + prev1;

            curr = Math.max(take,nottake);
            prev2 = prev1;
            prev1 = curr;
           }

           return curr;
         //to down recursion + memo
        // Arrays.fill(dp, -1);
        // return helper(nums.length - 1, nums, dp);
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