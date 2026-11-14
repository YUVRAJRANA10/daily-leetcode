class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i]; // Add at even indices
            } else {
                sum -= nums[i]; // Subtract at odd indices
            }
        }
        return sum;
    }
}