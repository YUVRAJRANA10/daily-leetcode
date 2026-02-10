class Solution {
    public int[] shuffle(int[] nums, int n) {
        


        for(int i  = 0; i < nums.length - n; i++){

        int temp = nums[i+1];
        nums[i + 1] = nums[i+n];
        nums[i+n] = temp;

        }


        return nums;
    }
}