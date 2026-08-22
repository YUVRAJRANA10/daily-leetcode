class Solution {
    public int arraySign(int[] nums) {
    int sign = 1;
        
        for (int i = 0; i < nums.length; i++) {
            // If we hit a 0, the product is immediately 0
            if (nums[i] == 0) {
                return 0;
            } 
            // If we hit a negative number, flip the sign
            else if (nums[i] < 0) {
                sign = -sign; 
            }
        }
        
        return sign;
    }
}