class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        
        // There are 2^n total subsets (from 0 to (1 << n) - 1)
        int totalSubsets = 1 << n;
        
        for (int i = 0; i < totalSubsets; i++) {
            int currentXor = 0;
            
            // Check each bit of 'i' to see if we include nums[j] in this subset
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentXor ^= nums[j];
                }
            }
            
            totalSum += currentXor;
        }
        
        return totalSum;
    }
}