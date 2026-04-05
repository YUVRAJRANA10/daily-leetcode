class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length == 1){
            return 0;
        }
        int n = nums.length - 1;
        
        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[n] > nums[n - 1]) {
            return n;
        }

        // for(int i = 1; i < n; i++){
        //     if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
        //         return i;
        //     }
        // }

        // return -1;

        int left = 1;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] > nums[mid -1] && nums[mid] > nums[mid+1]){
                return mid;
            }

            
           if(nums[mid] < nums[mid+ 1]){
            left = mid + 1;
           }
           else{
            right =mid -1;
           }
        }

        return -1;
    }
}