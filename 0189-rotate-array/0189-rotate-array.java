class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[( k + i) % n] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    //     int n = nums.length;
    //     k = k % n;   // very important

    //     // Step 1: reverse whole array
    //     reverse(nums, 0, n - 1);

    //     // Step 2: reverse first k elements
    //     reverse(nums, 0, k - 1);

    //     // Step 3: reverse remaining elements
    //     reverse(nums, k, n - 1);
    // }

    // private void reverse(int[] nums, int start, int end) {
    //     while (start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }
}
