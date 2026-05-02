class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        
        int[] res = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i += 2) {
            res[idx++] = nums[i + 1]; // Bob
            res[idx++] = nums[i];     // Alice
        }

        return res;
    }
}