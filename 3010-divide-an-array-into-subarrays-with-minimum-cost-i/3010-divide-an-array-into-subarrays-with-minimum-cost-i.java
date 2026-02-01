class Solution {
    public int minimumCost(int[] nums) {

        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {

                int current = nums[0] + nums[i] + nums[j];
                min = Math.min(min, current);

            }
        }

        return min;
    }
}
