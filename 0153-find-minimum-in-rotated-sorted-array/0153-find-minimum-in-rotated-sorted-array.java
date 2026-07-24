class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        // int mid = 0;

        // while (left < right) {

        //     mid = (left + right) / 2;

        //     if (nums[mid] > nums[right]) {
        //         left = mid + 1; // min is on right
        //     } else {
        //         right = mid; // min is on left (including mid)
        //     }
        // }

        // return nums[left];
        
        int min = Integer.MAX_VALUE;

        while(left<=right){


            int mid = (left + right)/2;

            if(nums[left] <= nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid+1;
            }

           else{

            min = Math.min(min,nums[mid]);
            right = mid -1;
           }
        }


        return min;
    }
}