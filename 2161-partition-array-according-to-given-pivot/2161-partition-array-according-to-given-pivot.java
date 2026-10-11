class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        
        // Step 1: Count how many pivots there are to find where they start/end
        int pivotCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                pivotCount++;
            }
        }
        
        // Find where the block of pivots should begin
        int lessCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                lessCount++;
            }
        }
        
        int left = 0;
        int mid = lessCount;
        int right = lessCount + pivotCount;
        
        // Step 2: Place all elements into their correct relative positions
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr[left++] = nums[i];
            } else if (nums[i] == pivot) {
                arr[mid++] = nums[i];
            } else {
                arr[right++] = nums[i];
            }
        }
        
        return arr;
    }
}