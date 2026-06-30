class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        
        // Fill the first n elements
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        
        // Fill the next n elements with reversed order
        // The element at index i in the second half corresponds to 
        // the element at index (n - 1 - i) in the original array
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[n - 1 - i];
        }
        
        return ans;
    }
}