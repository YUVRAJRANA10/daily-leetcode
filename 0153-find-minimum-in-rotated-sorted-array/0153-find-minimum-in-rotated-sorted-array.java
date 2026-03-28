class Solution {
    public int findMin(int[] nums) {
        

        int left = 0;
        int right = nums.length - 1;
        
        int mid = 0;


                while (left < right) {

             mid = (left + right) / 2;

            
            if (nums[mid] > nums[right]) {
                left = mid + 1;  // min is on right
            } else {
                right = mid;     // min is on left (including mid)
            }
        }

        return nums[left];


    }
}